.class public final Lcom/whoop/trends/data/model/ManualMeasurementSheet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;,
        Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002XWBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u0019J\u0094\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010:\u0012\u0004\u0008<\u0010=\u001a\u0004\u0008;\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010:\u0012\u0004\u0008?\u0010=\u001a\u0004\u0008>\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010@\u0012\u0004\u0008B\u0010=\u001a\u0004\u0008A\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010C\u0012\u0004\u0008E\u0010=\u001a\u0004\u0008D\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010C\u0012\u0004\u0008G\u0010=\u001a\u0004\u0008F\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010:\u0012\u0004\u0008I\u0010=\u001a\u0004\u0008H\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010:\u0012\u0004\u0008K\u0010=\u001a\u0004\u0008J\u0010\u0019R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010:\u0012\u0004\u0008M\u0010=\u001a\u0004\u0008L\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010N\u0012\u0004\u0008P\u0010=\u001a\u0004\u0008O\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010:\u0012\u0004\u0008R\u0010=\u001a\u0004\u0008Q\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010:\u0012\u0004\u0008T\u0010=\u001a\u0004\u0008S\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010:\u0012\u0004\u0008V\u0010=\u001a\u0004\u0008U\u0010\u0019\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "",
        "",
        "timestamp",
        "startDateTimestamp",
        "",
        "weightKG",
        "bodyFatPercent",
        "leanBodyMassKG",
        "bodyFatSuffix",
        "leanBodyMassSuffix",
        "metricType",
        "Lcom/whoop/trends/data/model/ReplaceDialog;",
        "replaceDialog",
        "source",
        "saveTitle",
        "deleteTitle",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()D",
        "component4",
        "()Ljava/lang/Double;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/trends/data/model/ReplaceDialog;",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
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
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTimestamp",
        "getTimestamp$annotations",
        "()V",
        "getStartDateTimestamp",
        "getStartDateTimestamp$annotations",
        "D",
        "getWeightKG",
        "getWeightKG$annotations",
        "Ljava/lang/Double;",
        "getBodyFatPercent",
        "getBodyFatPercent$annotations",
        "getLeanBodyMassKG",
        "getLeanBodyMassKG$annotations",
        "getBodyFatSuffix",
        "getBodyFatSuffix$annotations",
        "getLeanBodyMassSuffix",
        "getLeanBodyMassSuffix$annotations",
        "getMetricType",
        "getMetricType$annotations",
        "Lcom/whoop/trends/data/model/ReplaceDialog;",
        "getReplaceDialog",
        "getReplaceDialog$annotations",
        "getSource",
        "getSource$annotations",
        "getSaveTitle",
        "getSaveTitle$annotations",
        "getDeleteTitle",
        "getDeleteTitle$annotations",
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

.field public static final Companion:Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;


# instance fields
.field private final bodyFatPercent:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body_fat_percent"
    .end annotation
.end field

.field private final bodyFatSuffix:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body_fat_suffix"
    .end annotation
.end field

.field private final deleteTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "delete_title"
    .end annotation
.end field

.field private final leanBodyMassKG:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lean_body_mass_kg"
    .end annotation
.end field

.field private final leanBodyMassSuffix:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lean_body_mass_suffix"
    .end annotation
.end field

.field private final metricType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_type"
    .end annotation
.end field

.field private final replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "replace_dialog"
    .end annotation
.end field

.field private final saveTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "save_title"
    .end annotation
.end field

.field private final source:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "source"
    .end annotation
.end field

.field private final startDateTimestamp:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_date_timestamp"
    .end annotation
.end field

.field private final timestamp:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field private final weightKG:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weight_kg"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->Companion:Lcom/whoop/trends/data/model/ManualMeasurementSheet$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xfff

    const/16 v1, 0xfff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    iput-wide p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    iput-object p6, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    iput-object p7, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    iput-object p8, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    iput-object p12, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDateTimestamp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyFatSuffix"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricType"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    .line 5
    iput-wide p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    .line 6
    iput-object p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    .line 7
    iput-object p6, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    .line 8
    iput-object p7, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    .line 12
    iput-object p11, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    goto :goto_1

    :cond_2
    move-wide v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    goto :goto_2

    :cond_3
    move-object/from16 v4, p5

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    goto :goto_3

    :cond_4
    move-object/from16 v5, p6

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v6, p7

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v7, p8

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v8, p9

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    goto :goto_7

    :cond_8
    move-object/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v10, p11

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v11, p12

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_a
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-wide/from16 p5, v2

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_b

    :cond_b
    move-object/from16 p15, p13

    goto :goto_a

    :goto_b
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBodyFatPercent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "body_fat_percent"
    .end annotation

    return-void
.end method

.method public static synthetic getBodyFatSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "body_fat_suffix"
    .end annotation

    return-void
.end method

.method public static synthetic getDeleteTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "delete_title"
    .end annotation

    return-void
.end method

.method public static synthetic getLeanBodyMassKG$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "lean_body_mass_kg"
    .end annotation

    return-void
.end method

.method public static synthetic getLeanBodyMassSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "lean_body_mass_suffix"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_type"
    .end annotation

    return-void
.end method

.method public static synthetic getReplaceDialog$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "replace_dialog"
    .end annotation

    return-void
.end method

.method public static synthetic getSaveTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "save_title"
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

.method public static synthetic getStartDateTimestamp$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "start_date_timestamp"
    .end annotation

    return-void
.end method

.method public static synthetic getTimestamp$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "timestamp"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightKG$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_kg"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/trends/data/model/ReplaceDialog$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ReplaceDialog$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-object p0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/trends/data/model/ReplaceDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 15

    const-string v0, "timestamp"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDateTimestamp"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyFatSuffix"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricType"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/trends/data/model/ManualMeasurementSheet;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ReplaceDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBodyFatPercent()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final getBodyFatSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleteTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeanBodyMassKG()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    return-object v0
.end method

.method public final getLeanBodyMassSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    return-object v0
.end method

.method public final getReplaceDialog()Lcom/whoop/trends/data/model/ReplaceDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    return-object v0
.end method

.method public final getSaveTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartDateTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightKG()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/ReplaceDialog;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->timestamp:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->startDateTimestamp:Ljava/lang/String;

    iget-wide v3, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->weightKG:D

    iget-object v5, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatPercent:Ljava/lang/Double;

    iget-object v6, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassKG:Ljava/lang/Double;

    iget-object v7, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->bodyFatSuffix:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->leanBodyMassSuffix:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->metricType:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->replaceDialog:Lcom/whoop/trends/data/model/ReplaceDialog;

    iget-object v11, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->source:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->saveTitle:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->deleteTitle:Ljava/lang/String;

    const-string v14, ", startDateTimestamp="

    const-string v15, ", weightKG="

    const-string v0, "ManualMeasurementSheet(timestamp="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", bodyFatPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leanBodyMassKG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bodyFatSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", leanBodyMassSuffix="

    const-string v2, ", metricType="

    invoke-static {v0, v1, v8, v2, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", replaceDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", saveTitle="

    const-string v2, ", deleteTitle="

    invoke-static {v0, v1, v12, v2, v13}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
