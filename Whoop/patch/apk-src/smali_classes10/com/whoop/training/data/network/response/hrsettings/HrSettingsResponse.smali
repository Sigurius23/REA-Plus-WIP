.class public final Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$$serializer;,
        Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBY\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JN\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010 R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\"R \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00085\u0010\"R\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u00087\u0010%\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "",
        "",
        "screenTitle",
        "Lcom/whoop/training/data/network/response/hrsettings/Introduction;",
        "introduction",
        "",
        "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
        "heartRateEntryRow",
        "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
        "defaultHrZones",
        "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;",
        "manualHeartRateZonesForm",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$training_release",
        "(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/training/data/network/response/hrsettings/Introduction;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "component5",
        "()Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getScreenTitle",
        "Lcom/whoop/training/data/network/response/hrsettings/Introduction;",
        "getIntroduction",
        "Ljava/util/List;",
        "getHeartRateEntryRow",
        "getDefaultHrZones",
        "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;",
        "getManualHeartRateZonesForm",
        "Companion",
        "$serializer",
        "a",
        "training_release"
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

.field public static final Companion:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;


# instance fields
.field private final defaultHrZones:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_hr_zones"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;"
        }
    .end annotation
.end field

.field private final heartRateEntryRow:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "heart_rate_entry_row"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;"
        }
    .end annotation
.end field

.field private final introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "introduction"
    .end annotation
.end field

.field private final manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manual_heart_rate_zones_form"
    .end annotation
.end field

.field private final screenTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screen_title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->Companion:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldf2/a;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ldf2/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Ldf2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v0, v3, v2

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    iput-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/training/data/network/response/hrsettings/Introduction;",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;",
            "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;",
            ")V"
        }
    .end annotation

    const-string v0, "screenTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "introduction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateEntryRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultHrZones"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualHeartRateZonesForm"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    .line 5
    iput-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;ILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->copy(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$training_release(Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/training/data/network/response/hrsettings/Introduction$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/Introduction$$serializer;

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm$$serializer;

    iget-object p0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/training/data/network/response/hrsettings/Introduction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/training/data/network/response/hrsettings/Introduction;",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;",
            "Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;",
            ")",
            "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;"
        }
    .end annotation

    const-string v0, "screenTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "introduction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateEntryRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultHrZones"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualHeartRateZonesForm"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;-><init>(Ljava/lang/String;Lcom/whoop/training/data/network/response/hrsettings/Introduction;Ljava/util/List;Ljava/util/List;Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    iget-object p1, p1, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDefaultHrZones()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    return-object v0
.end method

.method public final getHeartRateEntryRow()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    return-object v0
.end method

.method public final getIntroduction()Lcom/whoop/training/data/network/response/hrsettings/Introduction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    return-object v0
.end method

.method public final getManualHeartRateZonesForm()Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    return-object v0
.end method

.method public final getScreenTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    invoke-virtual {v2}, Lcom/whoop/training/data/network/response/hrsettings/Introduction;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    invoke-virtual {v1}, Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->screenTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->introduction:Lcom/whoop/training/data/network/response/hrsettings/Introduction;

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->heartRateEntryRow:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->defaultHrZones:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;->manualHeartRateZonesForm:Lcom/whoop/training/data/network/response/hrsettings/ManualHeartRateZonesForm;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HrSettingsResponse(screenTitle="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", introduction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartRateEntryRow="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", defaultHrZones="

    const-string v1, ", manualHeartRateZonesForm="

    invoke-static {v5, v2, v0, v3, v1}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
