.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBU\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJR\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00042\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008\u0005\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u00081\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010,\u001a\u0004\u00082\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010,\u001a\u0004\u00083\u0010\u001c\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;",
        "",
        "",
        "planName",
        "",
        "isCustomized",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;",
        "planSelections",
        "source",
        "presetPlanCategory",
        "templateId",
        "<init>",
        "(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPlanName",
        "Z",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;",
        "getPlanSelections",
        "getSource",
        "getPresetPlanCategory",
        "getTemplateId",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;


# instance fields
.field private final isCustomized:Z

.field private final planName:Ljava/lang/String;

.field private final planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

.field private final presetPlanCategory:Ljava/lang/String;

.field private final source:Ljava/lang/String;

.field private final templateId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$$serializer;

    invoke-virtual {p8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "planName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planSelections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->copy(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    return v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;
    .locals 8

    const-string v0, "planName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "planSelections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;-><init>(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    iget-boolean v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getPlanName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlanSelections()Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    return-object v0
.end method

.method public final getPresetPlanCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getTemplateId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public final isCustomized()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planName:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->isCustomized:Z

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->planSelections:Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->source:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->presetPlanCategory:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;->templateId:Ljava/lang/String;

    const-string v6, ", isCustomized="

    const-string v7, ", planSelections="

    const-string v8, "SaveHubAndSpokeBody(planName="

    invoke-static {v8, v0, v6, v7, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", presetPlanCategory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", templateId="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
