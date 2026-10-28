.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBK\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R&\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010(\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008)\u0010\u001aR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010(\u0012\u0004\u0008-\u0010+\u001a\u0004\u0008,\u0010\u001aR&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010(\u0012\u0004\u0008/\u0010+\u001a\u0004\u0008.\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;",
        "",
        "",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
        "goalIds",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
        "activityIds",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
        "behaviorIds",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getGoalIds",
        "getGoalIds$annotations",
        "()V",
        "getActivityIds",
        "getActivityIds$annotations",
        "getBehaviorIds",
        "getBehaviorIds$annotations",
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

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$Companion;


# instance fields
.field private final activityIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final behaviorIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
            ">;"
        }
    .end annotation
.end field

.field private final goalIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkg2/d;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v2, Lkg2/d;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lkg2/d;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-nez p5, :cond_0

    iput-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
            ">;)V"
        }
    .end annotation

    const-string v0, "goalIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    .line 6
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    .line 7
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivityIds$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_goals"
    .end annotation

    return-void
.end method

.method public static synthetic getBehaviorIds$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "behavior_goals"
    .end annotation

    return-void
.end method

.method public static synthetic getGoalIds$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "target_goals"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
            ">;)",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;"
        }
    .end annotation

    const-string v0, "goalIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getActivityIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    return-object v0
.end method

.method public final getBehaviorIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    return-object v0
.end method

.method public final getGoalIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->goalIds:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->activityIds:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;->behaviorIds:Ljava/util/List;

    const-string v3, ", activityIds="

    const-string v4, ", behaviorIds="

    const-string v5, "AssociatedBehaviorsActivities(goalIds="

    invoke-static {v5, v3, v0, v4, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
