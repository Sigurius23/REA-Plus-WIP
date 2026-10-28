.class public final Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$$serializer;,
        Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002OPBU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u000e\u0010\u0017J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\nH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J`\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\u00062\u0008\u0010,\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u00089\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u0008:\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010A\u001a\u0004\u0008B\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010C\u001a\u0004\u0008D\u0010&R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010A\u001a\u0004\u0008E\u0010$\"\u0004\u0008F\u0010GRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nj\u0004\u0018\u0001`H\u00a2\u0006\u000c\u0008I\u0012\u0008\u0008J\u0012\u0004\u0008\t0K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010A\u001a\u0004\u0008L\u0010$\"\u0004\u0008M\u0010G\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "selectedInternalName",
        "",
        "gpsTrackingEnabled",
        "Lcom/whoop/navigation/e;",
        "destination",
        "",
        "stateKeys",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)V",
        "",
        "seen0",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/lang/Boolean;",
        "component4",
        "()Lcom/whoop/navigation/e;",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;",
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
        "(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getSelectedInternalName",
        "Ljava/lang/Boolean;",
        "getGpsTrackingEnabled",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Ljava/util/Map;",
        "getStateKeys",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getModal",
        "getBindings",
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

.field public static final Companion:Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;


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

.field private final destination:Lcom/whoop/navigation/e;

.field private final gpsTrackingEnabled:Ljava/lang/Boolean;

.field private final id:Ljava/lang/String;

.field private final modal:Lcom/whoop/design/models/modal/AnyModal;

.field private final selectedInternalName:Ljava/lang/String;

.field private final stateKeys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->Companion:Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lqa1/a;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lqa1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lqa1/a;

    const/16 v5, 0x19

    invoke-direct {v4, v5}, Lqa1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lqa1/a;

    const/16 v6, 0x1a

    invoke-direct {v5, v6}, Lqa1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lqa1/a;

    const/16 v7, 0x1b

    invoke-direct {v6, v7}, Lqa1/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v0, v6

    const/4 v6, 0x1

    aput-object v1, v0, v6

    const/4 v6, 0x2

    aput-object v1, v0, v6

    const/4 v6, 0x3

    aput-object v3, v0, v6

    const/4 v3, 0x4

    aput-object v4, v0, v3

    const/4 v3, 0x5

    aput-object v5, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$$serializer;->INSTANCE:Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->bindings:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->bindings:Ljava/util/Map;

    :goto_5
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    .line 8
    iput-object p4, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    .line 9
    iput-object p5, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    .line 10
    iput-object p6, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 11
    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move-object v3, p8

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    move-object v4, p8

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    move-object v5, p8

    goto :goto_2

    :cond_3
    move-object v5, p5

    :goto_2
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    move-object v6, p8

    :goto_3
    move-object v0, p0

    move-object v1, p1

    goto :goto_4

    :cond_4
    move-object v6, p6

    goto :goto_3

    .line 12
    :goto_4
    invoke-direct/range {v0 .. v6}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)V

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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$start_activity_release(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->bind(Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lqg2/a;->a(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            ")",
            "Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;

    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object p1, p1, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
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

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getGpsTrackingEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getSelectedInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateKeys()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

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

    iput-object p1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->selectedInternalName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->gpsTrackingEnabled:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->destination:Lcom/whoop/navigation/e;

    iget-object v4, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->stateKeys:Ljava/util/Map;

    iget-object v5, p0, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    const-string v6, ", selectedInternalName="

    const-string v7, ", gpsTrackingEnabled="

    const-string v8, "PreSessionWidgetModel(id="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stateKeys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
