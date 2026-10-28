.class public final Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$$serializer;,
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 S2\u00020\u0001:\u0002TSBw\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u008b\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0090\u0001\u0010/\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\"J\u0010\u00102\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00106\u001a\u0002052\u0008\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107J\'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001\u00a2\u0006\u0004\u0008>\u0010?R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010C\u001a\u0004\u0008D\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010E\u001a\u0004\u0008F\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008G\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010H\u001a\u0004\u0008I\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010J\u001a\u0004\u0008K\u0010\'R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010J\u001a\u0004\u0008L\u0010\'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010M\u001a\u0004\u0008N\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010O\u001a\u0004\u0008P\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010Q\u001a\u0004\u0008R\u0010.\u00a8\u0006U"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;",
        "",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "titleDisplay",
        "",
        "subtitleDisplay",
        "descriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;",
        "currentPlanTile",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "headerItems",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
        "goalSection",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;",
        "bannerTile",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;",
        "progressBar",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;",
        "gradientStyle",
        "<init>",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component2",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;",
        "component9",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;",
        "component10",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;",
        "copy",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;",
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
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getDatePicker",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "getTitleDisplay",
        "Ljava/lang/String;",
        "getSubtitleDisplay",
        "getDescriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;",
        "getCurrentPlanTile",
        "Ljava/util/List;",
        "getHeaderItems",
        "getGoalSection",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;",
        "getBannerTile",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;",
        "getProgressBar",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;",
        "getGradientStyle",
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

.field public static final Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;


# instance fields
.field private final bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

.field private final currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

.field private final datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final goalSection:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;"
        }
    .end annotation
.end field

.field private final gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

.field private final headerItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lut2/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lut2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lut2/a;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lut2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lut2/a;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Lut2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xa

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v1, v7, v9

    const/4 v9, 0x3

    aput-object v1, v7, v9

    const/4 v9, 0x4

    aput-object v1, v7, v9

    aput-object v3, v7, v4

    aput-object v5, v7, v6

    aput-object v1, v7, v8

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v2, v7, v0

    sput-object v7, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x1df

    const/16 v0, 0x1df

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    :goto_0
    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    return-void

    :cond_2
    iput-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalSection"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    .line 11
    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x20

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_1

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;-><init>(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;ILjava/lang/Object;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->copy(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component10()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    return-object v0
.end method

.method public final component9()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;",
            ")",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalSection"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;-><init>(Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    iget-object p1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBannerTile()Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    return-object v0
.end method

.method public final getCurrentPlanTile()Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoalSection()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    return-object v0
.end method

.method public final getGradientStyle()Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    return-object v0
.end method

.method public final getHeaderItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    return-object v0
.end method

.method public final getProgressBar()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->titleDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->descriptionDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->currentPlanTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/CurrentPlanTile;

    iget-object v5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->headerItems:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->goalSection:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->bannerTile:Lcom/whoop/weeklyplan/weeklyplan/domain/models/BannerCalloutTile;

    iget-object v8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->progressBar:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    iget-object v9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;->gradientStyle:Lcom/whoop/weeklyplan/weeklyplan/domain/models/GradientStyle;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "WeeklyPlanModel(datePicker="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleDisplay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitleDisplay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", descriptionDisplay="

    const-string v1, ", currentPlanTile="

    invoke-static {v10, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", headerItems="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", goalSection="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bannerTile="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressBar="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gradientStyle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
