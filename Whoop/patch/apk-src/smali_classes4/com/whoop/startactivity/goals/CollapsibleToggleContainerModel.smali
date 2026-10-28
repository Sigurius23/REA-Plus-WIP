.class public final Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$$serializer;,
        Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;,
        Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;,
        Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0004UVWXBO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0010\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0014H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*Jb\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010$J\u0010\u0010/\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u00032\u0008\u00101\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008\u0004\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010>\u001a\u0004\u0008?\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010B\u001a\u0004\u0008C\u0010&R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010D\u001a\u0004\u0008E\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010F\u001a\u0004\u0008G\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008H\u0010*R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`N\u00a2\u0006\u000c\u0008O\u0012\u0008\u0008P\u0012\u0004\u0008\t0Q8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010I\u001a\u0004\u0008R\u0010K\"\u0004\u0008S\u0010M\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "isToggleOn",
        "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;",
        "toggleStyle",
        "",
        "title",
        "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;",
        "badge",
        "",
        "items",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "toggleOnInteraction",
        "toggleOffInteraction",
        "<init>",
        "(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;",
        "component1",
        "()Z",
        "component2",
        "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component7",
        "copy",
        "(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;",
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
        "(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Z",
        "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;",
        "getToggleStyle",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;",
        "getBadge",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getToggleOnInteraction",
        "getToggleOffInteraction",
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
        "b",
        "Badge",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;


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

.field private final badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

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

.field private final isToggleOn:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->Companion:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljx2/b;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ljx2/b;

    const/16 v5, 0x19

    invoke-direct {v4, v5}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Ljx2/b;

    const/16 v6, 0x1a

    invoke-direct {v5, v6}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v3, v5, v6

    const/4 v3, 0x2

    aput-object v1, v5, v3

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v4, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$$serializer;->INSTANCE:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    iput-object p4, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    iput-object p6, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p9, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p10, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;",
            "Ljava/lang/String;",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "toggleStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    .line 5
    iput-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    .line 7
    iput-object p5, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 9
    iput-object p7, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;-><init>(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.startactivity.goals.CollapsibleToggleContainerModel.ToggleStyle"

    invoke-static {}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;->values()[Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->copy(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$start_activity_release(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$$serializer;->INSTANCE:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge$$serializer;

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->bind(Ljava/util/Map;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "accumulatedState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-static {v3, v1, v2, v0}, Lcom/whoop/startactivity/goals/b;->a(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    move-result-object v4

    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v4

    .line 4
    :cond_0
    iget-object v1, v4, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 5
    new-instance v9, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 7
    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    .line 8
    invoke-static {v2}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    .line 9
    instance-of v6, v5, Lcom/whoop/design/models/WithGeneratedBindings;

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1

    :cond_1
    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v6, v0}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v7

    :goto_2
    instance-of v8, v6, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v8, :cond_3

    move-object v7, v6

    check-cast v7, Lcom/whoop/design/models/DesignSystemModel;

    :cond_3
    if-nez v7, :cond_4

    move-object v11, v5

    goto :goto_3

    :cond_4
    move-object v11, v7

    .line 10
    :goto_3
    instance-of v5, v2, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v5, :cond_5

    move-object v10, v2

    check-cast v10, Lcom/whoop/design/models/DesignModelWrapper;

    const/16 v16, 0x1e

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lcom/whoop/design/models/DesignModelWrapper;->copy$default(Lcom/whoop/design/models/DesignModelWrapper;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/DesignModelWrapper;

    move-result-object v11

    .line 11
    :cond_5
    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const/16 v12, 0x6f

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 12
    invoke-static/range {v4 .. v13}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->copy$default(Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    move-result-object v0

    .line 13
    invoke-static {v0, v4}, Lcom/whoop/design/models/binding/ContentBindingResolverKt;->copyBindingsFrom(Lcom/whoop/design/models/WithGeneratedBindings;Lcom/whoop/design/models/WithGeneratedBindings;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v0

    check-cast v0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    return-object v0
.end method

.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    return v0
.end method

.method public final component2()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;",
            "Ljava/lang/String;",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;"
        }
    .end annotation

    const-string v0, "toggleStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;-><init>(ZLcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;Ljava/lang/String;Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;

    iget-boolean v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    iget-boolean v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
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

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBadge()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

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

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggleStyle()Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final isToggleOn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

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

    iput-object p1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->isToggleOn:Z

    iget-object v1, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleStyle:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$b;

    iget-object v2, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->badge:Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel$Badge;

    iget-object v4, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->items:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v6, p0, Lcom/whoop/startactivity/goals/CollapsibleToggleContainerModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "CollapsibleToggleContainerModel(isToggleOn="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", toggleStyle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toggleOnInteraction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toggleOffInteraction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
