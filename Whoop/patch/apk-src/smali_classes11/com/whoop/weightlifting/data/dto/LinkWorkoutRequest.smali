.class public final Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$$serializer;,
        Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J:\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010*\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008+\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00080\u0010-\u001a\u0004\u0008/\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u0010-\u001a\u0004\u00082\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00104\u0012\u0004\u00086\u0010-\u001a\u0004\u00085\u0010 \u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;",
        "",
        "",
        "activityId",
        "",
        "templateId",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "template",
        "",
        "rpe",
        "<init>",
        "(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()J",
        "component3",
        "()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "component4",
        "()Ljava/lang/Integer;",
        "copy",
        "(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getActivityId",
        "getActivityId$annotations",
        "()V",
        "J",
        "getTemplateId",
        "getTemplateId$annotations",
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "getTemplate",
        "getTemplate$annotations",
        "Ljava/lang/Integer;",
        "getRpe",
        "getRpe$annotations",
        "Companion",
        "$serializer",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;


# instance fields
.field private final activityId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activity_id"
    .end annotation
.end field

.field private final rpe:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rpe"
    .end annotation
.end field

.field private final template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "template"
    .end annotation
.end field

.field private final templateId:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "template_id"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->Companion:Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$$serializer;

    invoke-virtual {p7}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    return-void

    :cond_1
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "activityId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "template"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    .line 5
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    .line 6
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;-><init>(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    :cond_3
    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->copy(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivityId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_id"
    .end annotation

    return-void
.end method

.method public static synthetic getRpe$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "rpe"
    .end annotation

    return-void
.end method

.method public static synthetic getTemplate$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "template"
    .end annotation

    return-void
.end method

.method public static synthetic getTemplateId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "template_id"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto$$serializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    return-wide v0
.end method

.method public final component3()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;
    .locals 7

    const-string v0, "activityId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "template"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;-><init>(Ljava/lang/String;JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getActivityId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRpe()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getTemplate()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    return-object v0
.end method

.method public final getTemplateId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->activityId:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->templateId:J

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->template:Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;->rpe:Ljava/lang/Integer;

    const-string v5, "LinkWorkoutRequest(activityId="

    const-string v6, ", templateId="

    invoke-static {v5, v0, v1, v2, v6}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", template="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
