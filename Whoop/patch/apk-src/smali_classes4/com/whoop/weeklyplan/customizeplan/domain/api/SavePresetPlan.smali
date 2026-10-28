.class public final Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$$serializer;,
        Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B9\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBU\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 JJ\u0010!\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008-\u0010\u001cR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008.\u0010\u001cR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00100\u001a\u0004\u00081\u0010 \u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;",
        "",
        "",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
        "targetGoals",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
        "activityGoals",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
        "behaviorGoals",
        "Lcom/whoop/design/models/items/PlanStyle;",
        "presetName",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/PlanStyle;",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;",
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
        "getTargetGoals",
        "getActivityGoals",
        "getBehaviorGoals",
        "Lcom/whoop/design/models/items/PlanStyle;",
        "getPresetName",
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

.field public static final Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;


# instance fields
.field private final activityGoals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
            ">;"
        }
    .end annotation
.end field

.field private final behaviorGoals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
            ">;"
        }
    .end annotation
.end field

.field private final presetName:Lcom/whoop/design/models/items/PlanStyle;

.field private final targetGoals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lcom/whoop/design/models/modal/a;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v2, Lcom/whoop/design/models/modal/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/design/models/modal/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/design/models/modal/a;

    const/16 v5, 0x1b

    invoke-direct {v4, v5}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x4

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
            ">;",
            "Lcom/whoop/design/models/items/PlanStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "targetGoals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityGoals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorGoals"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presetName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.PlanStyle"

    invoke-static {}, Lcom/whoop/design/models/items/PlanStyle;->values()[Lcom/whoop/design/models/items/PlanStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;ILjava/lang/Object;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/PlanStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
            ">;",
            "Lcom/whoop/design/models/items/PlanStyle;",
            ")",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;"
        }
    .end annotation

    const-string v0, "targetGoals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityGoals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorGoals"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "presetName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/PlanStyle;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    iget-object p1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getActivityGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    return-object v0
.end method

.method public final getBehaviorGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    return-object v0
.end method

.method public final getPresetName()Lcom/whoop/design/models/items/PlanStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    return-object v0
.end method

.method public final getTargetGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->targetGoals:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->activityGoals:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->behaviorGoals:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;->presetName:Lcom/whoop/design/models/items/PlanStyle;

    const-string v4, ", activityGoals="

    const-string v5, ", behaviorGoals="

    const-string v6, "SavePresetPlan(targetGoals="

    invoke-static {v6, v4, v0, v5, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", presetName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
