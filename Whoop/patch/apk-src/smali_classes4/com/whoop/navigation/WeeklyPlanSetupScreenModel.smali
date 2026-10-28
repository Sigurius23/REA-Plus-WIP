.class public final Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$$serializer;,
        Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 T2\u00020\u0001:\u0002UVB\u00bb\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00b7\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010\u001dJ\u00c8\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00106\u001a\u00020\u00042\u0008\u00105\u001a\u0004\u0018\u000104H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107J\'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001\u00a2\u0006\u0004\u0008>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010C\u001a\u0004\u0008D\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010C\u001a\u0004\u0008E\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008F\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008H\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008I\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010A\u001a\u0004\u0008J\u0010\u001dR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008K\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008L\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008M\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010A\u001a\u0004\u0008N\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010A\u001a\u0004\u0008O\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010A\u001a\u0004\u0008P\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010A\u001a\u0004\u0008Q\u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010A\u001a\u0004\u0008R\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010A\u001a\u0004\u0008S\u0010\u001d\u00a8\u0006W"
    }
    d2 = {
        "Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "",
        "planName",
        "",
        "locked",
        "noPlanShowMetricSelection",
        "analyticsSource",
        "Lcom/whoop/navigation/InitialSelectionModel;",
        "initialSelection",
        "date",
        "source",
        "presetPlanCategory",
        "planTitle",
        "description",
        "explanationTitle",
        "explanation",
        "templateId",
        "category",
        "carouselPlacement",
        "dismissalType",
        "<init>",
        "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/InitialSelectionModel;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPlanName",
        "Z",
        "getLocked",
        "getNoPlanShowMetricSelection",
        "getAnalyticsSource",
        "Lcom/whoop/navigation/InitialSelectionModel;",
        "getInitialSelection",
        "getDate",
        "getSource",
        "getPresetPlanCategory",
        "getPlanTitle",
        "getDescription",
        "getExplanationTitle",
        "getExplanation",
        "getTemplateId",
        "getCategory",
        "getCarouselPlacement",
        "getDismissalType",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;


# instance fields
.field private final analyticsSource:Ljava/lang/String;

.field private final carouselPlacement:Ljava/lang/String;

.field private final category:Ljava/lang/String;

.field private final date:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final dismissalType:Ljava/lang/String;

.field private final explanation:Ljava/lang/String;

.field private final explanationTitle:Ljava/lang/String;

.field private final initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

.field private final locked:Z

.field private final noPlanShowMetricSelection:Z

.field private final planName:Ljava/lang/String;

.field private final planTitle:Ljava/lang/String;

.field private final presetPlanCategory:Ljava/lang/String;

.field private final source:Ljava/lang/String;

.field private final templateId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->Companion:Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x9

    const/16 v1, 0x9

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$$serializer;->INSTANCE:Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    goto :goto_0

    :cond_1
    iput-boolean p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    :goto_1
    iput-object p5, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p10, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p11, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p12, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_a

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iput-object p13, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_b

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    :goto_a
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_c

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_d

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    :goto_c
    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_e

    iput-object p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    return-void

    :cond_e
    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "planName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    .line 5
    iput-boolean p3, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v16, v2

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v17, v2

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v18, v2

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move-object/from16 v19, v2

    :goto_d
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v7, p4

    goto :goto_e

    :cond_d
    move-object/from16 v19, p16

    goto :goto_d

    .line 19
    :goto_e
    invoke-direct/range {v3 .. v19}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->copy(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    if-eqz v1, :cond_1

    :goto_0
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    if-eqz v1, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/navigation/InitialSelectionModel$$serializer;->INSTANCE:Lcom/whoop/navigation/InitialSelectionModel$$serializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    if-eqz v1, :cond_19

    :goto_c
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    if-eqz v1, :cond_1b

    :goto_d
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/InitialSelectionModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;
    .locals 18

    const-string v0, "planName"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsSource"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/InitialSelectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAnalyticsSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    return-object v0
.end method

.method public final getCarouselPlacement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDismissalType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    return-object v0
.end method

.method public final getExplanation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    return-object v0
.end method

.method public final getExplanationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialSelection()Lcom/whoop/navigation/InitialSelectionModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    return-object v0
.end method

.method public final getLocked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    return v0
.end method

.method public final getNoPlanShowMetricSelection()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    return v0
.end method

.method public final getPlanName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlanTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPresetPlanCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getTemplateId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/InitialSelectionModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planName:Ljava/lang/String;

    iget-boolean v2, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->locked:Z

    iget-boolean v3, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->noPlanShowMetricSelection:Z

    iget-object v4, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->analyticsSource:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->initialSelection:Lcom/whoop/navigation/InitialSelectionModel;

    iget-object v6, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->date:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->source:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->presetPlanCategory:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->planTitle:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->description:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanationTitle:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->explanation:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->templateId:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->category:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->carouselPlacement:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->dismissalType:Ljava/lang/String;

    const-string v0, ", locked="

    move-object/from16 v17, v15

    const-string v15, ", noPlanShowMetricSelection="

    move-object/from16 v18, v13

    const-string v13, "WeeklyPlanSetupScreenModel(planName="

    invoke-static {v13, v1, v0, v15, v2}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", analyticsSource="

    const-string v2, ", initialSelection="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", date="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", presetPlanCategory="

    const-string v2, ", planTitle="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", description="

    const-string v2, ", explanationTitle="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", explanation="

    const-string v2, ", templateId="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", category="

    const-string v2, ", carouselPlacement="

    move-object/from16 v3, v18

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", dismissalType="

    const-string v2, ")"

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
