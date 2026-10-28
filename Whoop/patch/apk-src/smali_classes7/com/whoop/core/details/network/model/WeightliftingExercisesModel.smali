.class public final Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$$serializer;,
        Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBu\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010#J\u0010\u0010)\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010#Jp\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010#J\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00089\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008:\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008;\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008<\u0010#R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008=\u0010#R\u0017\u0010\r\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008>\u0010#\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;",
        "",
        "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;",
        "exerciseSummary",
        "Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;",
        "exerciseSummaryCarousel",
        "",
        "repsTitleDisplay",
        "titleDisplay",
        "tonnageTitleDisplay",
        "tonnageUnitsDisplay",
        "intensityUnitsDisplay",
        "intensityTitleDisplay",
        "viewAllLabelDisplay",
        "<init>",
        "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/core/details/network/model/ExerciseSummaryModel;",
        "component2",
        "()Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/core/details/network/model/ExerciseSummaryModel;",
        "getExerciseSummary",
        "Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;",
        "getExerciseSummaryCarousel",
        "Ljava/lang/String;",
        "getRepsTitleDisplay",
        "getTitleDisplay",
        "getTonnageTitleDisplay",
        "getTonnageUnitsDisplay",
        "getIntensityUnitsDisplay",
        "getIntensityTitleDisplay",
        "getViewAllLabelDisplay",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;


# instance fields
.field private final exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

.field private final exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

.field private final intensityTitleDisplay:Ljava/lang/String;

.field private final intensityUnitsDisplay:Ljava/lang/String;

.field private final repsTitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;

.field private final tonnageTitleDisplay:Ljava/lang/String;

.field private final tonnageUnitsDisplay:Ljava/lang/String;

.field private final viewAllLabelDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->Companion:Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "exerciseSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseSummaryCarousel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageTitleDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageUnitsDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewAllLabelDisplay"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->copy(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/ExerciseSummaryModel$$serializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel$$serializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object p0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/core/details/network/model/ExerciseSummaryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;
    .locals 11

    const-string v0, "exerciseSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseSummaryCarousel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageTitleDisplay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageUnitsDisplay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewAllLabelDisplay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;-><init>(Lcom/whoop/core/details/network/model/ExerciseSummaryModel;Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getExerciseSummary()Lcom/whoop/core/details/network/model/ExerciseSummaryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    return-object v0
.end method

.method public final getExerciseSummaryCarousel()Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    return-object v0
.end method

.method public final getIntensityTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntensityUnitsDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepsTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTonnageTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTonnageUnitsDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewAllLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/ExerciseSummaryModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummary:Lcom/whoop/core/details/network/model/ExerciseSummaryModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->exerciseSummaryCarousel:Lcom/whoop/core/details/network/model/ExerciseSummaryCarouselModel;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->repsTitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->titleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageTitleDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->tonnageUnitsDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityUnitsDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->intensityTitleDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;->viewAllLabelDisplay:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "WeightliftingExercisesModel(exerciseSummary="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseSummaryCarousel="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", repsTitleDisplay="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", titleDisplay="

    const-string v1, ", tonnageTitleDisplay="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", tonnageUnitsDisplay="

    const-string v1, ", intensityUnitsDisplay="

    invoke-static {v9, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", intensityTitleDisplay="

    const-string v1, ", viewAllLabelDisplay="

    invoke-static {v9, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
