.class public final Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$$serializer;,
        Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=B]\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBy\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$Jt\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010$R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008:\u0010$R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u0008;\u0010$R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00108\u001a\u0004\u0008<\u0010$\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
        "",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
        "interest",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;",
        "contraceptionType",
        "",
        "typicalCycleLength",
        "",
        "",
        "lastPeriodDateRange",
        "removedPeriodDays",
        "symptoms",
        "goals",
        "<init>",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
        "component2",
        "()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;",
        "component3",
        "()Ljava/lang/Integer;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
        "getInterest",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;",
        "getContraceptionType",
        "Ljava/lang/Integer;",
        "getTypicalCycleLength",
        "Ljava/util/List;",
        "getLastPeriodDateRange",
        "getRemovedPeriodDays",
        "getSymptoms",
        "getGoals",
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

.field public static final Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;


# instance fields
.field private final contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

.field private final goals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field private final lastPeriodDateRange:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final removedPeriodDays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final symptoms:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final typicalCycleLength:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lal0/i;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lal0/i;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lal0/i;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lal0/i;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lal0/i;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lal0/i;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lal0/i;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lal0/i;-><init>(I)V

    invoke-static {v0, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lal0/i;

    const/16 v7, 0x11

    invoke-direct {v6, v7}, Lal0/i;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lal0/i;

    const/16 v8, 0x12

    invoke-direct {v7, v8}, Lal0/i;-><init>(I)V

    invoke-static {v0, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v7, 0x7

    new-array v7, v7, [Ll83/h;

    const/4 v8, 0x0

    aput-object v2, v7, v8

    const/4 v2, 0x1

    aput-object v3, v7, v2

    const/4 v2, 0x2

    aput-object v1, v7, v2

    const/4 v1, 0x3

    aput-object v4, v7, v1

    const/4 v1, 0x4

    aput-object v5, v7, v1

    const/4 v1, 0x5

    aput-object v6, v7, v1

    const/4 v1, 0x6

    aput-object v0, v7, v1

    sput-object v7, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$$serializer;

    invoke-virtual {p9}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lastPeriodDateRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removedPeriodDays"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptoms"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goals"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.onboarding.domain.models.MciInterest"

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType"

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->copy(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

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

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;"
        }
    .end annotation

    const-string v0, "lastPeriodDateRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removedPeriodDays"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptoms"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goals"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;-><init>(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getContraceptionType()Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    return-object v0
.end method

.method public final getGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    return-object v0
.end method

.method public final getInterest()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    return-object v0
.end method

.method public final getLastPeriodDateRange()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    return-object v0
.end method

.method public final getRemovedPeriodDays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    return-object v0
.end method

.method public final getSymptoms()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    return-object v0
.end method

.method public final getTypicalCycleLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->interest:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->contraceptionType:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->typicalCycleLength:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->lastPeriodDateRange:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->removedPeriodDays:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->symptoms:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;->goals:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "MciOnboardingRequest(interest="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contraceptionType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", typicalCycleLength="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastPeriodDateRange="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", removedPeriodDays="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", symptoms="

    const-string v1, ", goals="

    invoke-static {v7, v4, v0, v5, v1}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
