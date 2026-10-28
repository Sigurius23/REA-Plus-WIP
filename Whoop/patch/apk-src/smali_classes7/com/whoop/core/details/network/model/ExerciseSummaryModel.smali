.class public final Lcom/whoop/core/details/network/model/ExerciseSummaryModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;,
        Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u0019J\u0092\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0019R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008;\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u0008<\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008=\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008>\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008?\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008@\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u0008A\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00108\u001a\u0004\u0008B\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00108\u001a\u0004\u0008C\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00108\u001a\u0004\u0008D\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00108\u001a\u0004\u0008E\u0010\u0019\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;",
        "",
        "",
        "avgHrTitleDisplay",
        "",
        "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
        "exerciseCardGroups",
        "hrUnitsDisplay",
        "mskIntensityPercentTitleDisplay",
        "mskIntensityPercentValueDisplay",
        "oneRepMaxIntensityTitleDisplay",
        "oneRepMaxIntensityUnitDisplay",
        "repsDisplay",
        "repsTitleDisplay",
        "titleDisplay",
        "tonnageDisplay",
        "weightTitleDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ExerciseSummaryModel;",
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
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getAvgHrTitleDisplay",
        "Ljava/util/List;",
        "getExerciseCardGroups",
        "getHrUnitsDisplay",
        "getMskIntensityPercentTitleDisplay",
        "getMskIntensityPercentValueDisplay",
        "getOneRepMaxIntensityTitleDisplay",
        "getOneRepMaxIntensityUnitDisplay",
        "getRepsDisplay",
        "getRepsTitleDisplay",
        "getTitleDisplay",
        "getTonnageDisplay",
        "getWeightTitleDisplay",
        "Companion",
        "$serializer",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;


# instance fields
.field private final avgHrTitleDisplay:Ljava/lang/String;

.field private final exerciseCardGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
            ">;"
        }
    .end annotation
.end field

.field private final hrUnitsDisplay:Ljava/lang/String;

.field private final mskIntensityPercentTitleDisplay:Ljava/lang/String;

.field private final mskIntensityPercentValueDisplay:Ljava/lang/String;

.field private final oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

.field private final oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

.field private final repsDisplay:Ljava/lang/String;

.field private final repsTitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;

.field private final tonnageDisplay:Ljava/lang/String;

.field private final weightTitleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->Companion:Lcom/whoop/core/details/network/model/ExerciseSummaryModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/core/details/network/model/a;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xc

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v2, v3, v5

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    aput-object v1, v3, v4

    const/16 v0, 0xb

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xf9f

    const/16 v0, 0xf9f

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    :goto_1
    iput-object p9, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "avgHrTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseCardGroups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrUnitsDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskIntensityPercentTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskIntensityPercentValueDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repsDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repsTitleDisplay"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageDisplay"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightTitleDisplay"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x20

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p13, p13, 0x40

    if-eqz p13, :cond_1

    move-object p13, p12

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p13, p12

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p13}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/ExerciseCardGroupModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/ExerciseCardGroupModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/ExerciseSummaryModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

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

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xb

    iget-object p0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ExerciseSummaryModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;"
        }
    .end annotation

    const-string v0, "avgHrTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseCardGroups"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrUnitsDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskIntensityPercentTitleDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskIntensityPercentValueDisplay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repsDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repsTitleDisplay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageDisplay"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weightTitleDisplay"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    move-object v2, p1

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v13}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAvgHrTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseCardGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getHrUnitsDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMskIntensityPercentTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMskIntensityPercentValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getOneRepMaxIntensityTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getOneRepMaxIntensityUnitDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepsDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepsTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTonnageDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->avgHrTitleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->exerciseCardGroups:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hrUnitsDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentTitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->mskIntensityPercentValueDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityTitleDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->oneRepMaxIntensityUnitDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->repsTitleDisplay:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->titleDisplay:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->tonnageDisplay:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->weightTitleDisplay:Ljava/lang/String;

    const-string v12, ", exerciseCardGroups="

    const-string v13, ", hrUnitsDisplay="

    const-string v14, "ExerciseSummaryModel(avgHrTitleDisplay="

    invoke-static {v14, v0, v12, v13, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mskIntensityPercentTitleDisplay="

    const-string v12, ", mskIntensityPercentValueDisplay="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", oneRepMaxIntensityTitleDisplay="

    const-string v2, ", oneRepMaxIntensityUnitDisplay="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", repsDisplay="

    const-string v2, ", repsTitleDisplay="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", titleDisplay="

    const-string v2, ", tonnageDisplay="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", weightTitleDisplay="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
