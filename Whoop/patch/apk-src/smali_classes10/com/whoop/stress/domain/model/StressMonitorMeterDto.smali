.class public final Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;,
        Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278B1\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJD\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010-\u0012\u0004\u0008/\u0010,\u001a\u0004\u0008.\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010-\u0012\u0004\u00081\u0010,\u001a\u0004\u00080\u0010\u001cR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010-\u0012\u0004\u00083\u0010,\u001a\u0004\u00082\u0010\u001cR \u0010\u0008\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010-\u0012\u0004\u00085\u0010,\u001a\u0004\u00084\u0010\u001c\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
        "",
        "",
        "fillPercent",
        "",
        "stressScore",
        "stressText",
        "meterMin",
        "meterMax",
        "<init>",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressMonitorMeterDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Float;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Float;",
        "getFillPercent",
        "getFillPercent$annotations",
        "()V",
        "Ljava/lang/String;",
        "getStressScore",
        "getStressScore$annotations",
        "getStressText",
        "getStressText$annotations",
        "getMeterMin",
        "getMeterMin$annotations",
        "getMeterMax",
        "getMeterMax$annotations",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;


# instance fields
.field private final fillPercent:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge_fill_percentage"
    .end annotation
.end field

.field private final meterMax:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge_max_display"
    .end annotation
.end field

.field private final meterMin:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge_min_display"
    .end annotation
.end field

.field private final stressScore:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge_score_display"
    .end annotation
.end field

.field private final stressText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge_subtext_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->Companion:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "stressScore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meterMin"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meterMax"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressMonitorMeterDto;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getFillPercent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge_fill_percentage"
    .end annotation

    return-void
.end method

.method public static synthetic getMeterMax$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge_max_display"
    .end annotation

    return-void
.end method

.method public static synthetic getMeterMin$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge_min_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStressScore$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge_score_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStressText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge_subtext_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressMonitorMeterDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
    .locals 7

    const-string v0, "stressScore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meterMin"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meterMax"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;-><init>(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFillPercent()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    return-object v0
.end method

.method public final getMeterMax()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    return-object v0
.end method

.method public final getMeterMin()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    return-object v0
.end method

.method public final getStressScore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    return-object v0
.end method

.method public final getStressText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->fillPercent:Ljava/lang/Float;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressScore:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->stressText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMin:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->meterMax:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "StressMonitorMeterDto(fillPercent="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stressScore="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stressText="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", meterMin="

    const-string v1, ", meterMax="

    invoke-static {v5, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
