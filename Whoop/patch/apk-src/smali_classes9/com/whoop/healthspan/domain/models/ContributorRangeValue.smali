.class public final Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;,
        Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBK\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJH\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008.\u0010\u001aR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008/\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "",
        "",
        "valueDisplay",
        "valueUnitDisplay",
        "",
        "valueRangePercentage",
        "style",
        "expandedValueLabelDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()D",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getValueDisplay",
        "getValueUnitDisplay",
        "D",
        "getValueRangePercentage",
        "getStyle",
        "getExpandedValueLabelDisplay",
        "Companion",
        "$serializer",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;


# instance fields
.field private final expandedValueLabelDisplay:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final valueDisplay:Ljava/lang/String;

.field private final valueRangePercentage:D

.field private final valueUnitDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->Companion:Lcom/whoop/healthspan/domain/models/ContributorRangeValue$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;

    invoke-virtual {p8}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    iput-wide p4, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    .line 6
    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p5, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    :cond_4
    move-object p7, p5

    move-object p8, p6

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 8

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    iget-wide v5, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getExpandedValueLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueRangePercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    return-wide v0
.end method

.method public final getValueUnitDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueUnitDisplay:Ljava/lang/String;

    iget-wide v2, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->valueRangePercentage:D

    iget-object v4, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->style:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->expandedValueLabelDisplay:Ljava/lang/String;

    const-string v6, ", valueUnitDisplay="

    const-string v7, ", valueRangePercentage="

    const-string v8, "ContributorRangeValue(valueDisplay="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expandedValueLabelDisplay="

    const-string v2, ")"

    invoke-static {v0, v1, v5, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
