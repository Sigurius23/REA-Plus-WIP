.class public final Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$$serializer;,
        Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JX\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00088\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010\'\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;",
        "",
        "titleDisplay",
        "descriptionDisplay",
        "upsellTitle",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;",
        "upsellContent",
        "buttonTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "nextId",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "progress",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;",
        "component5",
        "component6",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "component7",
        "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "getDescriptionDisplay",
        "getUpsellTitle",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;",
        "getUpsellContent",
        "getButtonTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "getNextId",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "getProgress",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;


# instance fields
.field private final buttonTitle:Ljava/lang/String;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

.field private final progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

.field private final titleDisplay:Ljava/lang/String;

.field private final upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

.field private final upsellTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lal0/i;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lal0/i;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v0, v2, v3

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$$serializer;

    invoke-virtual {p9}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upsellTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upsellContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final component7()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;
    .locals 9

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upsellTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upsellContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final getProgress()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpsellContent()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    return-object v0
.end method

.method public final getUpsellTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->descriptionDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->upsellContent:Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->buttonTitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    const-string v7, ", descriptionDisplay="

    const-string v8, ", upsellTitle="

    const-string v9, "MciIntegrationScreen(titleDisplay="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upsellContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nextId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
