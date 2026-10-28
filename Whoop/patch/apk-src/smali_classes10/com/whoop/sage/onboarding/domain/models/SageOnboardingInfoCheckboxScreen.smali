.class public final Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$$serializer;,
        Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<=BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBg\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J^\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00087\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00088\u0010\u001eR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008:\u0010&\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;",
        "",
        "imageUrl",
        "title",
        "subtitle",
        "",
        "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
        "sections",
        "checkboxText",
        "nextButtonText",
        "Lj72/g;",
        "buttonNextId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sage_release",
        "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "()Lj72/g;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getImageUrl",
        "getTitle",
        "getSubtitle",
        "Ljava/util/List;",
        "getSections",
        "getCheckboxText",
        "getNextButtonText",
        "Lj72/g;",
        "getButtonNextId",
        "Companion",
        "$serializer",
        "a",
        "sage_release"
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

.field public static final Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;


# instance fields
.field private final buttonNextId:Lj72/g;

.field private final checkboxText:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final nextButtonText:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
            ">;"
        }
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->Companion:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lh00/d0;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lh00/d0;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lh00/d0;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lh00/d0;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v1, 0x6

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$$serializer;->INSTANCE:Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$$serializer;

    invoke-virtual {p9}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lj72/g;",
            ")V"
        }
    .end annotation

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkboxText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextButtonText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection$$serializer;->INSTANCE:Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.sage.onboarding.presentation.SageOnboardingScreenId"

    invoke-static {}, Lj72/g;->values()[Lj72/g;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;ILjava/lang/Object;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sage_release(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lj72/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lj72/g;",
            ")",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;"
        }
    .end annotation

    const-string v0, "imageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkboxText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextButtonText"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    iget-object p1, p1, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getButtonNextId()Lj72/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    return-object v0
.end method

.method public final getCheckboxText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->imageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->sections:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->checkboxText:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->nextButtonText:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;->buttonNextId:Lj72/g;

    const-string v7, ", title="

    const-string v8, ", subtitle="

    const-string v9, "SageOnboardingInfoCheckboxScreen(imageUrl="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sections="

    const-string v7, ", checkboxText="

    invoke-static {v2, v1, v7, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", nextButtonText="

    const-string v2, ", buttonNextId="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
