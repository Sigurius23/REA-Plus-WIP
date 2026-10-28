.class public final Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$$serializer;,
        Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FEB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBm\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\n\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u000eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J:\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010#J\u0010\u0010,\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00062\u0008\u0010.\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00082\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00083\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010(R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>RE\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`?\u00a2\u0006\u000c\u0008@\u0012\u0008\u0008A\u0012\u0004\u0008\t0B8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008C\u0010<\"\u0004\u0008D\u0010>\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "selectedActivityInternalName",
        "",
        "gpsTrackingEnabled",
        "Lcom/whoop/navigation/e;",
        "restoreSessionDestination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strength_workout_release",
        "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getSelectedActivityInternalName",
        "Z",
        "getGpsTrackingEnabled",
        "Lcom/whoop/navigation/e;",
        "getRestoreSessionDestination",
        "getRestoreSessionDestination$annotations",
        "()V",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "strength-workout_release"
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

.field public static final Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$Companion;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final gpsTrackingEnabled:Z

.field private final id:Ljava/lang/String;

.field private final restoreSessionDestination:Lcom/whoop/navigation/e;

.field private final selectedActivityInternalName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->Companion:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lbf2/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lbf2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lbf2/a;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lbf2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v0, v3, v2

    const/4 v0, 0x5

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$$serializer;->INSTANCE:Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->bindings:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->bindings:Ljava/util/Map;

    :goto_3
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_5
    iput-object p7, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedActivityInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    .line 7
    iput-boolean p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    .line 8
    iput-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 9
    const-string p2, ""

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 10
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getRestoreSessionDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$strength_workout_release(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->bind(Ljava/util/Map;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModelStateBindingKt;->generatedBind(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    return v0
.end method

.method public final component4()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedActivityInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getGpsTrackingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRestoreSessionDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getSelectedActivityInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->selectedActivityInternalName:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->gpsTrackingEnabled:Z

    iget-object v3, p0, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->restoreSessionDestination:Lcom/whoop/navigation/e;

    const-string v4, ", selectedActivityInternalName="

    const-string v5, ", gpsTrackingEnabled="

    const-string v6, "StrengthWorkoutModel(id="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", restoreSessionDestination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
