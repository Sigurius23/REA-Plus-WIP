.class public final Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$$serializer;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 O2\u00020\u0001:\u0002POBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u008b\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\"J\u008e\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\"J\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010>\u001a\u0004\u0008?\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008A\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010>\u001a\u0004\u0008B\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010@\u001a\u0004\u0008C\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010D\u001a\u0004\u0008E\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010F\u001a\u0004\u0008G\u0010$R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010D\u001a\u0004\u0008J\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010K\u001a\u0004\u0008L\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010D\u001a\u0004\u0008M\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010D\u001a\u0004\u0008N\u0010\"\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;",
        "",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
        "range",
        "",
        "increment",
        "usableRange",
        "value",
        "",
        "valueLabel",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
        "recommendedRange",
        "",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
        "rangeContent",
        "valueUnits",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;",
        "averageLine",
        "topText",
        "bottomText",
        "<init>",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "component9",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;",
        "component10",
        "component11",
        "copy",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;",
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
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
        "getRange",
        "D",
        "getIncrement",
        "getUsableRange",
        "getValue",
        "Ljava/lang/String;",
        "getValueLabel",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
        "getRecommendedRange",
        "Ljava/util/List;",
        "getRangeContent",
        "getValueUnits",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;",
        "getAverageLine",
        "getTopText",
        "getBottomText",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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

.field public static final Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$Companion;


# instance fields
.field private final averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

.field private final bottomText:Ljava/lang/String;

.field private final increment:D

.field private final range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

.field private final rangeContent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;"
        }
    .end annotation
.end field

.field private final recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

.field private final topText:Ljava/lang/String;

.field private final usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

.field private final value:D

.field private final valueLabel:Ljava/lang/String;

.field private final valueUnits:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/modal/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lcom/whoop/design/models/modal/a;-><init>(I)V

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

    aput-object v2, v3, v4

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7ff

    const/16 v1, 0x7ff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$$serializer;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iput-wide p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iput-wide p6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    iput-object p8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    iput-object p10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    iput-object p13, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
            "D",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
            "D",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usableRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueLabel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeContent"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    .line 4
    iput-wide p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    .line 5
    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    .line 6
    iput-wide p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    .line 7
    iput-object p7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    .line 9
    iput-object p9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    .line 10
    iput-object p10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    .line 11
    iput-object p11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    .line 12
    iput-object p12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    .line 13
    iput-object p13, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-wide v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    goto :goto_0

    :cond_1
    move-wide v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    goto :goto_1

    :cond_2
    move-object/from16 v3, p4

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-wide v4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    goto :goto_2

    :cond_3
    move-wide/from16 v4, p5

    :goto_2
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    iget-object v6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v6, p7

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    iget-object v7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    goto :goto_4

    :cond_5
    move-object/from16 v7, p8

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    iget-object v8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    goto :goto_5

    :cond_6
    move-object/from16 v8, p9

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    iget-object v9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v9, p10

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    iget-object v10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    goto :goto_7

    :cond_8
    move-object/from16 v10, p11

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    iget-object v11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v11, p12

    :goto_8
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_9
    move-object p2, p0

    move-object p3, p1

    move-wide/from16 p4, v1

    move-object/from16 p6, v3

    move-wide/from16 p7, v4

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_a

    :cond_a
    move-object/from16 p15, p13

    goto :goto_9

    :goto_a
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->copy(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-wide v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-object p0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    return-wide v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    return-object v0
.end method

.method public final copy(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
            "D",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;",
            "D",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;"
        }
    .end annotation

    const-string v0, "range"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usableRange"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueLabel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeContent"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-wide/from16 v3, p2

    move-wide/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLcom/whoop/weeklyplan/customizeplan/domain/api/Range;DLjava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ljava/util/List;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    iget-wide v5, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    iget-wide v5, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    return-object v0
.end method

.method public final getBottomText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncrement()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    return-wide v0
.end method

.method public final getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    return-object v0
.end method

.method public final getRangeContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    return-object v0
.end method

.method public final getRecommendedRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    return-object v0
.end method

.method public final getTopText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsableRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    return-object v0
.end method

.method public final getValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    return-wide v0
.end method

.method public final getValueLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    invoke-static {v2, v1, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->range:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iget-wide v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->increment:D

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->usableRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    iget-wide v4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->value:D

    iget-object v6, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->recommendedRange:Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    iget-object v8, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->rangeContent:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->valueUnits:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->averageLine:Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    iget-object v11, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->topText:Ljava/lang/String;

    iget-object v12, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->bottomText:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "SliderContent(range="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", increment="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", usableRange="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", valueLabel="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", recommendedRange="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rangeContent="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", valueUnits="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", averageLine="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", topText="

    const-string v1, ", bottomText="

    invoke-static {v13, v0, v11, v1, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
