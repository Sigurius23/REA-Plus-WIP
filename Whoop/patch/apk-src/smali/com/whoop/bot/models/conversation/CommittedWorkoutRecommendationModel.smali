.class public final Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$$serializer;,
        Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0081\u0008\u0018\u0000 82\u00020\u0001:\u000298B5\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJF\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00082\u00103\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00087\u0010\u001f\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "activityRecommendation",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "activityRecommendationV2",
        "Lcom/whoop/bot/models/conversation/ActionButton;",
        "startActivityButton",
        "generateAlternativeButton",
        "decommitButton",
        "<init>",
        "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "component2",
        "()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "component3",
        "()Lcom/whoop/bot/models/conversation/ActionButton;",
        "component4",
        "component5",
        "copy",
        "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;",
        "getActivityRecommendation",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "getActivityRecommendationV2",
        "getActivityRecommendationV2$annotations",
        "()V",
        "Lcom/whoop/bot/models/conversation/ActionButton;",
        "getStartActivityButton",
        "getGenerateAlternativeButton",
        "getDecommitButton",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;


# instance fields
.field private final activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

.field private final activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activity_recommendation_v2"
    .end annotation
.end field

.field private final decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

.field private final generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

.field private final startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->Companion:Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1d

    const/16 v0, 0x1d

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    :goto_0
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iput-object p6, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)V
    .locals 1

    const-string v0, "startActivityButton"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generateAlternativeButton"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decommitButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    .line 7
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;-><init>(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->copy(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivityRecommendationV2$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_recommendation_v2"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$$serializer;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/whoop/bot/models/conversation/ActionButton$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/ActionButton$$serializer;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public final component4()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public final component5()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public final copy(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;
    .locals 7

    const-string v0, "startActivityButton"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generateAlternativeButton"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decommitButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;-><init>(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getActivityRecommendation()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    return-object v0
.end method

.method public final getActivityRecommendationV2()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    return-object v0
.end method

.method public final getDecommitButton()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public final getGenerateAlternativeButton()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public final getStartActivityButton()Lcom/whoop/bot/models/conversation/ActionButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/ActionButton;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/ActionButton;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendation:Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->activityRecommendationV2:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->startActivityButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->generateAlternativeButton:Lcom/whoop/bot/models/conversation/ActionButton;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;->decommitButton:Lcom/whoop/bot/models/conversation/ActionButton;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CommittedWorkoutRecommendationModel(activityRecommendation="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activityRecommendationV2="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startActivityButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", generateAlternativeButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", decommitButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
