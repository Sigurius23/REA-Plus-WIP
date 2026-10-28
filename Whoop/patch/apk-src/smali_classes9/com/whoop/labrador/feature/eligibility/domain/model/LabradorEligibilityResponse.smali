.class public final Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$$serializer;,
        Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0081\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J|\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00109\u0012\u0004\u0008=\u0010>\u001a\u0004\u0008<\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008?\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008@\u0010\u0019R&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010A\u0012\u0004\u0008C\u0010>\u001a\u0004\u0008B\u0010\u001fR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010D\u0012\u0004\u0008F\u0010>\u001a\u0004\u0008E\u0010!R\u001a\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010G\u001a\u0004\u0008H\u0010#R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00109\u001a\u0004\u0008I\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010&\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "",
        "",
        "icon",
        "pageTitle",
        "backgroundImage",
        "title",
        "body",
        "",
        "conditions",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;",
        "regionPicker",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
        "acknowledgeAllToggle",
        "buttonLabel",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;",
        "component8",
        "()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
        "component9",
        "component10",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$labrador_release",
        "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getIcon",
        "getPageTitle",
        "getBackgroundImage",
        "getBackgroundImage$annotations",
        "()V",
        "getTitle",
        "getBody",
        "Ljava/util/List;",
        "getConditions",
        "getConditions$annotations",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;",
        "getRegionPicker",
        "getRegionPicker$annotations",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
        "getAcknowledgeAllToggle",
        "getButtonLabel",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Companion",
        "$serializer",
        "labrador_release"
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

.field public static final Companion:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$Companion;


# instance fields
.field private final acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "acknowledge_all_toggle"
    .end annotation
.end field

.field private final backgroundImage:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private final body:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body"
    .end annotation
.end field

.field private final buttonLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button_label"
    .end annotation
.end field

.field private final conditions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "suitability_conditions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final destination:Lcom/whoop/navigation/e;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "destination"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final pageTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "page_title"
    .end annotation
.end field

.field private final regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "supported_region_picker"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->Companion:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Llq2/h;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Llq2/h;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Llq2/h;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Llq2/h;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xa

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v3, v4, v5

    const/4 v3, 0x6

    aput-object v1, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$$serializer;

    invoke-virtual {p12}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    iput-object p9, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    iput-object p10, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "conditions"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "regionPicker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acknowledgeAllToggle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonLabel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    .line 10
    iput-object p8, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    .line 11
    iput-object p9, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBackgroundImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getConditions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "suitability_conditions"
    .end annotation

    return-void
.end method

.method public static synthetic getRegionPicker$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "supported_region_picker"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$labrador_release(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker$$serializer;

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle$$serializer;->INSTANCE:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle$$serializer;

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    return-object v0
.end method

.method public final component8()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "conditions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "regionPicker"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acknowledgeAllToggle"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAcknowledgeAllToggle()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    return-object v0
.end method

.method public final getBackgroundImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getConditions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRegionPicker()Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    invoke-virtual {v2}, Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    invoke-virtual {v0}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->pageTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->backgroundImage:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->body:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->conditions:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->regionPicker:Lcom/whoop/labrador/feature/eligibility/domain/model/SupportedRegionPicker;

    iget-object v7, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->acknowledgeAllToggle:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorSetupToggle;

    iget-object v8, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->buttonLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->destination:Lcom/whoop/navigation/e;

    const-string v10, ", pageTitle="

    const-string v11, ", backgroundImage="

    const-string v12, "LabradorEligibilityResponse(icon="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    const-string v10, ", body="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", conditions="

    const-string v2, ", regionPicker="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acknowledgeAllToggle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
