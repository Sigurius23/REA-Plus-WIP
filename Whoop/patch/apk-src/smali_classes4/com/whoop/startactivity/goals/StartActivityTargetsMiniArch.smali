.class public final Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$$serializer;,
        Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RSBW\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u008b\u0001\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0012H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J`\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\t2\u0008\u0010.\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008;\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008=\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008>\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008A\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008C\u0010&R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010D\u001a\u0004\u0008E\u0010(R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`K\u00a2\u0006\u000c\u0008L\u0012\u0008\u0008M\u0012\u0004\u0008\t0N8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010F\u001a\u0004\u0008O\u0010H\"\u0004\u0008P\u0010J\u00a8\u0006T"
    }
    d2 = {
        "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;",
        "component",
        "path",
        "activityType",
        "",
        "gpsEnabled",
        "Lcom/whoop/startactivity/goals/TargetsScoreType;",
        "scoreType",
        "showLoading",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Boolean;",
        "component6",
        "()Lcom/whoop/startactivity/goals/TargetsScoreType;",
        "component7",
        "()Z",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$start_activity_release",
        "(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;",
        "getComponent",
        "getPath",
        "getActivityType",
        "Ljava/lang/Boolean;",
        "getGpsEnabled",
        "Lcom/whoop/startactivity/goals/TargetsScoreType;",
        "getScoreType",
        "Z",
        "getShowLoading",
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
        "a",
        "$serializer",
        "start-activity_release"
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

.field public static final Companion:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;

.field public static final DEFAULT_ID:Ljava/lang/String; = "start-activity-targets"


# instance fields
.field private final activityType:Ljava/lang/String;

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

.field private final component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

.field private final gpsEnabled:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

.field private final showLoading:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->Companion:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljx2/b;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ljx2/b;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lkg2/d;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lkg2/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    const/4 v3, 0x2

    aput-object v1, v5, v3

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v4, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;-><init>(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p11, p1, 0x1

    if-nez p11, :cond_0

    .line 3
    const-string p2, "start-activity-targets"

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    goto :goto_5

    :cond_6
    iput-boolean p8, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p11, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    .line 8
    iput-object p3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    .line 11
    iput-object p6, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    .line 12
    iput-boolean p7, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 13
    const-string p1, "start-activity-targets"

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, 0x1

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 14
    invoke-direct/range {p2 .. p9}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;-><init>(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;->INSTANCE:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "com.whoop.startactivity.goals.StartActivityTargetsMiniArchComponent"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/TargetsScoreType;->Companion:Lcom/whoop/startactivity/goals/TargetsScoreType$a;

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/TargetsScoreType$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;ZILjava/lang/Object;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->copy(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$start_activity_release(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    const-string v3, "start-activity-targets"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    if-eqz v3, :cond_5

    :goto_2
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    if-eqz v3, :cond_7

    :goto_3
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    if-eqz v3, :cond_9

    :goto_4
    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    if-eqz v3, :cond_b

    :goto_5
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    if-eq v3, v1, :cond_d

    :goto_6
    iget-boolean v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->bind(Ljava/util/Map;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lkg2/g;->a(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Lcom/whoop/startactivity/goals/TargetsScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;-><init>(Ljava/lang/String;Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/startactivity/goals/TargetsScoreType;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    iget-boolean p1, p1, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getActivityType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getComponent()Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    return-object v0
.end method

.method public final getGpsEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreType()Lcom/whoop/startactivity/goals/TargetsScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    return-object v0
.end method

.method public final getShowLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
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

    iput-object p1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->component:Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArchComponent;

    iget-object v2, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->path:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->activityType:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->gpsEnabled:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->scoreType:Lcom/whoop/startactivity/goals/TargetsScoreType;

    iget-boolean v6, p0, Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;->showLoading:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "StartActivityTargetsMiniArch(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", component="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", path="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", activityType="

    const-string v1, ", gpsEnabled="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scoreType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showLoading="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
