.class public final Lcom/whoop/trends/data/model/MeasurementBox;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/MeasurementBox$$serializer;,
        Lcom/whoop/trends/data/model/MeasurementBox$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eBi\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0015Jf\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001\u00a2\u0006\u0004\u0008/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00102\u0012\u0004\u00087\u00105\u001a\u0004\u00086\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00102\u0012\u0004\u00089\u00105\u001a\u0004\u00088\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010:\u0012\u0004\u0008<\u00105\u001a\u0004\u0008;\u0010\u0019R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00102\u0012\u0004\u0008>\u00105\u001a\u0004\u0008=\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00102\u0012\u0004\u0008@\u00105\u001a\u0004\u0008?\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010A\u0012\u0004\u0008C\u00105\u001a\u0004\u0008B\u0010\u001dR \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00102\u0012\u0004\u0008E\u00105\u001a\u0004\u0008D\u0010\u0015\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/MeasurementBox;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "icon",
        "iconUrl",
        "",
        "weight",
        "metricUnit",
        "subtitle",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "weightDetailsScreen",
        "source",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()D",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)Lcom/whoop/trends/data/model/MeasurementBox;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/MeasurementBox;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getId$annotations",
        "()V",
        "getIcon",
        "getIcon$annotations",
        "getIconUrl",
        "getIconUrl$annotations",
        "D",
        "getWeight",
        "getWeight$annotations",
        "getMetricUnit",
        "getMetricUnit$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "getWeightDetailsScreen",
        "getWeightDetailsScreen$annotations",
        "getSource",
        "getSource$annotations",
        "Companion",
        "$serializer",
        "trends_release"
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

.field public static final Companion:Lcom/whoop/trends/data/model/MeasurementBox$Companion;


# instance fields
.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final iconUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon_url"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final metricUnit:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_unit"
    .end annotation
.end field

.field private final source:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "source"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final weight:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight"
    .end annotation
.end field

.field private final weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight_details_screen"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/MeasurementBox$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/MeasurementBox$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/MeasurementBox;->Companion:Lcom/whoop/trends/data/model/MeasurementBox$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/trends/data/model/MeasurementBox$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MeasurementBox$$serializer;

    invoke-virtual {p11}, Lcom/whoop/trends/data/model/MeasurementBox$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    iput-wide p5, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    iput-object p7, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iput-object p10, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricUnit"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    .line 7
    iput-object p6, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    .line 10
    iput-object p9, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/MeasurementBox;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/trends/data/model/MeasurementBox;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-wide p4, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p6, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p7, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p8, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    iget-object p9, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    :cond_7
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/trends/data/model/MeasurementBox;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)Lcom/whoop/trends/data/model/MeasurementBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getIconUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon_url"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricUnit$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_unit"
    .end annotation

    return-void
.end method

.method public static synthetic getSource$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "source"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getWeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightDetailsScreen$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_details_screen"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/MeasurementBox;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object p0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)Lcom/whoop/trends/data/model/MeasurementBox;
    .locals 11

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricUnit"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/MeasurementBox;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/trends/data/model/MeasurementBox;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/MeasurementBox;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/MeasurementBox;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeight()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    return-wide v0
.end method

.method public final getWeightDetailsScreen()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementBox;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementBox;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementBox;->iconUrl:Ljava/lang/String;

    iget-wide v3, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weight:D

    iget-object v5, p0, Lcom/whoop/trends/data/model/MeasurementBox;->metricUnit:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/trends/data/model/MeasurementBox;->subtitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/trends/data/model/MeasurementBox;->weightDetailsScreen:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v8, p0, Lcom/whoop/trends/data/model/MeasurementBox;->source:Ljava/lang/String;

    const-string v9, ", icon="

    const-string v10, ", iconUrl="

    const-string v11, "MeasurementBox(id="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", metricUnit="

    const-string v2, ", subtitle="

    invoke-static {v0, v1, v5, v2, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", weightDetailsScreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
