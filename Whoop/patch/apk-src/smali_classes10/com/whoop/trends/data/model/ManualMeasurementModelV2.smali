.class public final Lcom/whoop/trends/data/model/ManualMeasurementModelV2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/ManualMeasurementModelV2$$serializer;,
        Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 V2\u00020\u0001:\u0002WVBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u008d\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0086\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101J\'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001\u00a2\u0006\u0004\u00088\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010;\u0012\u0004\u0008=\u0010>\u001a\u0004\u0008<\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010;\u0012\u0004\u0008@\u0010>\u001a\u0004\u0008?\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010;\u0012\u0004\u0008B\u0010>\u001a\u0004\u0008A\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010;\u0012\u0004\u0008D\u0010>\u001a\u0004\u0008C\u0010\u001aR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010E\u0012\u0004\u0008G\u0010>\u001a\u0004\u0008F\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010;\u0012\u0004\u0008I\u0010>\u001a\u0004\u0008H\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010;\u0012\u0004\u0008K\u0010>\u001a\u0004\u0008J\u0010\u001aR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010;\u0012\u0004\u0008M\u0010>\u001a\u0004\u0008L\u0010\u001aR \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010;\u0012\u0004\u0008O\u0010>\u001a\u0004\u0008N\u0010\u001aR&\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010P\u0012\u0004\u0008R\u0010>\u001a\u0004\u0008Q\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010S\u0012\u0004\u0008U\u0010>\u001a\u0004\u0008T\u0010\'\u00a8\u0006X"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "timestamp",
        "startDateTimestamp",
        "measurementTitle",
        "",
        "vo2MaxValue",
        "vo2MaxUnit",
        "deleteTitle",
        "saveTitle",
        "selectedSource",
        "",
        "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
        "sourceItems",
        "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;",
        "confirmDialog",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()D",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Ljava/util/List;",
        "component11",
        "()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)Lcom/whoop/trends/data/model/ManualMeasurementModelV2;",
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
        "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getTimestamp",
        "getTimestamp$annotations",
        "getStartDateTimestamp",
        "getStartDateTimestamp$annotations",
        "getMeasurementTitle",
        "getMeasurementTitle$annotations",
        "D",
        "getVo2MaxValue",
        "getVo2MaxValue$annotations",
        "getVo2MaxUnit",
        "getVo2MaxUnit$annotations",
        "getDeleteTitle",
        "getDeleteTitle$annotations",
        "getSaveTitle",
        "getSaveTitle$annotations",
        "getSelectedSource",
        "getSelectedSource$annotations",
        "Ljava/util/List;",
        "getSourceItems",
        "getSourceItems$annotations",
        "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;",
        "getConfirmDialog",
        "getConfirmDialog$annotations",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;


# instance fields
.field private final confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "confirm_dialog"
    .end annotation
.end field

.field private final deleteTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "delete_title"
    .end annotation
.end field

.field private final measurementTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "measurement_title"
    .end annotation
.end field

.field private final saveTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "save_title"
    .end annotation
.end field

.field private final selectedSource:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selected_source"
    .end annotation
.end field

.field private final sourceItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "source_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;"
        }
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

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final vo2MaxUnit:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vo2_max_unit"
    .end annotation
.end field

.field private final vo2MaxValue:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vo2_max_value"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->Companion:Lcom/whoop/trends/data/model/ManualMeasurementModelV2$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lwi0/d;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lwi0/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v2, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/trends/data/model/ManualMeasurementModelV2$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementModelV2$$serializer;

    invoke-virtual {p14}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    iput-wide p6, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    iput-object p8, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    iput-object p13, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;",
            "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDateTimestamp"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurementTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vo2MaxUnit"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveTitle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedSource"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceItems"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmDialog"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    .line 8
    iput-object p7, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    .line 13
    iput-object p12, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;ILjava/lang/Object;)Lcom/whoop/trends/data/model/ManualMeasurementModelV2;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-wide p5, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p7, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p8, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p9, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p10, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p11, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    :cond_9
    and-int/lit16 p13, p13, 0x400

    if-eqz p13, :cond_a

    iget-object p12, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    :cond_a
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-wide p7, p5

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)Lcom/whoop/trends/data/model/ManualMeasurementModelV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getConfirmDialog$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "confirm_dialog"
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

.method public static synthetic getMeasurementTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "measurement_title"
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

.method public static synthetic getSelectedSource$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "selected_source"
    .end annotation

    return-void
.end method

.method public static synthetic getSourceItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "source_items"
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

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static synthetic getVo2MaxUnit$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "vo2_max_unit"
    .end annotation

    return-void
.end method

.method public static synthetic getVo2MaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "vo2_max_value"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)Lcom/whoop/trends/data/model/ManualMeasurementModelV2;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;",
            "Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;",
            ")",
            "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDateTimestamp"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurementTitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vo2MaxUnit"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveTitle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedSource"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceItems"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmDialog"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;

    move-object v2, p1

    move-wide/from16 v6, p5

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v13}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    iget-object p1, p1, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getConfirmDialog()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    return-object v0
.end method

.method public final getDeleteTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMeasurementTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSaveTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    return-object v0
.end method

.method public final getStartDateTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getVo2MaxUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final getVo2MaxValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->timestamp:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->startDateTimestamp:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->measurementTitle:Ljava/lang/String;

    iget-wide v4, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxValue:D

    iget-object v6, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->vo2MaxUnit:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->deleteTitle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->saveTitle:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->selectedSource:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->sourceItems:Ljava/util/List;

    iget-object v11, p0, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->confirmDialog:Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    const-string v12, ", timestamp="

    const-string v13, ", startDateTimestamp="

    const-string v14, "ManualMeasurementModelV2(title="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", measurementTitle="

    const-string v12, ", vo2MaxValue="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", vo2MaxUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deleteTitle="

    const-string v2, ", saveTitle="

    invoke-static {v0, v1, v7, v2, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", selectedSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", confirmDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
