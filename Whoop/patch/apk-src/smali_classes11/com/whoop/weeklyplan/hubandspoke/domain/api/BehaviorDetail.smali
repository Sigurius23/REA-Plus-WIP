.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 +2\u00020\u0001:\u0002,+B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ8\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008*\u0010\u001a\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;",
        "",
        "",
        "behaviorTrackerId",
        "",
        "title",
        "titleAvoid",
        "description",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getBehaviorTrackerId",
        "Ljava/lang/String;",
        "getTitle",
        "getTitleAvoid",
        "getDescription",
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

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$Companion;


# instance fields
.field private final behaviorTrackerId:I

.field private final description:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleAvoid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleAvoid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleAvoid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;

    iget v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    iget v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBehaviorTrackerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleAvoid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->behaviorTrackerId:I

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->titleAvoid:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;->description:Ljava/lang/String;

    const-string v4, ", title="

    const-string v5, ", titleAvoid="

    const-string v6, "BehaviorDetail(behaviorTrackerId="

    invoke-static {v0, v6, v4, v1, v5}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
