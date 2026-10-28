.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bk\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jh\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\u000b2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00087\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00088\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010&R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008>\u0010*\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;",
        "",
        "",
        "toggleDisplay",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;",
        "toggleType",
        "selectedStyle",
        "sliderDisplay",
        "",
        "",
        "sliderOptions",
        "",
        "toggled",
        "",
        "selectedSliderOption",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "()Z",
        "component7",
        "()Ljava/lang/Double;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getToggleDisplay",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;",
        "getToggleType",
        "getSelectedStyle",
        "getSliderDisplay",
        "Ljava/util/Map;",
        "getSliderOptions",
        "Z",
        "getToggled",
        "Ljava/lang/Double;",
        "getSelectedSliderOption",
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;


# instance fields
.field private final selectedSliderOption:Ljava/lang/Double;

.field private final selectedStyle:Ljava/lang/String;

.field private final sliderDisplay:Ljava/lang/String;

.field private final sliderOptions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final toggleDisplay:Ljava/lang/String;

.field private final toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

.field private final toggled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqo1/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lqo1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lqo1/a;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lqo1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v0, v3, v2

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$$serializer;

    invoke-virtual {p9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    iput-boolean p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    iput-object p8, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;Z",
            "Ljava/lang/Double;",
            ")V"
        }
    .end annotation

    const-string v0, "toggleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleType"

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;->values()[Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->copy(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    return v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;Z",
            "Ljava/lang/Double;",
            ")",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;"
        }
    .end annotation

    const-string v0, "toggleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;-><init>(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    iget-boolean v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getSelectedSliderOption()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSelectedStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSliderDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSliderOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    return-object v0
.end method

.method public final getToggleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleType()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    return-object v0
.end method

.method public final getToggled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggleType:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedStyle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->sliderOptions:Ljava/util/Map;

    iget-boolean v5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->toggled:Z

    iget-object v6, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;->selectedSliderOption:Ljava/lang/Double;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "LogPeriodToggle(toggleDisplay="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", toggleType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedStyle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", sliderDisplay="

    const-string v1, ", sliderOptions="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toggled="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectedSliderOption="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
