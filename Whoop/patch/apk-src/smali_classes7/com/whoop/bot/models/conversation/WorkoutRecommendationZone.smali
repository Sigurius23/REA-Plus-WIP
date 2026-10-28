.class public final Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$$serializer;,
        Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0081\u0008\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ:\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u0008/\u0010\u001c\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;",
        "",
        "",
        "size",
        "",
        "style",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "<init>",
        "(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()F",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "copy",
        "(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "getSize",
        "Ljava/lang/String;",
        "getStyle",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getSubtitle",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;


# instance fields
.field private final size:F

.field private final style:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->Companion:Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->$stable:I

    return-void
.end method

.method public constructor <init>(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    .line 3
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IFLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 6
    sget-object p6, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$$serializer;

    invoke-virtual {p6}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->copy(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;
    .locals 1

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;-><init>(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;

    iget v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    iget v3, p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getSize()F
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->size:F

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->style:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;->subtitle:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WorkoutRecommendationZone(size="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
