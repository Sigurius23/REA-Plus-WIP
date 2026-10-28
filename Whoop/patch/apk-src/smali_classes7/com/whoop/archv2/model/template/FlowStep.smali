.class public final Lcom/whoop/archv2/model/template/FlowStep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/FlowStep$$serializer;,
        Lcom/whoop/archv2/model/template/FlowStep$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 Z2\u00020\u0001:\u0002[\\B\u00ae\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0018\u0008\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00a1\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ#\u0010\"\u001a\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\u000fH\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J \u00100\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00101J3\u00103\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00101J\u00b9\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0018\u0008\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00084\u00105J\u0010\u00106\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u00088\u00109J\u001a\u0010<\u001a\u00020;2\u0008\u0010:\u001a\u0004\u0018\u00010 H\u00d6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001\u00a2\u0006\u0004\u0008D\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010G\u001a\u0004\u0008H\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010I\u001a\u0004\u0008J\u0010\'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010K\u001a\u0004\u0008L\u0010)R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010M\u001a\u0004\u0008N\u0010+R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010O\u001a\u0004\u0008P\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Q\u001a\u0004\u0008R\u0010/R\'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010S\u001a\u0004\u0008T\u00101R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010S\u001a\u0004\u0008U\u00101\"\u0004\u0008V\u0010WRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u00178\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010S\u001a\u0004\u0008X\u00101\"\u0004\u0008Y\u0010W\u00a8\u0006]"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/FlowStep;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "template",
        "Lcom/whoop/archv2/model/template/BackgroundModel;",
        "background",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressButton",
        "",
        "",
        "requiredKeys",
        "Lcom/whoop/archv2/model/template/BackBehavior;",
        "backBehavior",
        "Lcom/whoop/archv2/model/template/FlowStepTransition;",
        "stepTransition",
        "",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvents",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "component2",
        "()Lcom/whoop/archv2/model/template/BackgroundModel;",
        "component3",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/archv2/model/template/BackBehavior;",
        "component6",
        "()Lcom/whoop/archv2/model/template/FlowStepTransition;",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "component9",
        "copy",
        "(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowStep;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$arch_v2_release",
        "(Lcom/whoop/archv2/model/template/FlowStep;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "getTemplate",
        "Lcom/whoop/archv2/model/template/BackgroundModel;",
        "getBackground",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressButton",
        "Ljava/util/List;",
        "getRequiredKeys",
        "Lcom/whoop/archv2/model/template/BackBehavior;",
        "getBackBehavior",
        "Lcom/whoop/archv2/model/template/FlowStepTransition;",
        "getStepTransition",
        "Ljava/util/Map;",
        "getAnalyticEvents",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "arch-v2_release"
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

.field public static final Companion:Lcom/whoop/archv2/model/template/FlowStep$a;


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

.field private final analyticEvents:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;"
        }
    .end annotation
.end field

.field private final backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

.field private final background:Lcom/whoop/archv2/model/template/BackgroundModel;

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

.field private final progressButton:Lcom/whoop/design/models/ProgressButtonModel;

.field private final requiredKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

.field private final template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/archv2/model/template/FlowStep$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/model/template/FlowStep$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/model/template/FlowStep;->Companion:Lcom/whoop/archv2/model/template/FlowStep$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/model/template/FlowStep;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcb1/a;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcb1/a;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lcb1/a;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lcb1/a;

    const/16 v7, 0x11

    invoke-direct {v6, v7}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lcb1/a;

    const/16 v8, 0x12

    invoke-direct {v7, v8}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lcb1/a;

    const/16 v9, 0x13

    invoke-direct {v8, v9}, Lcb1/a;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v8, 0x9

    new-array v8, v8, [Ll83/h;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    const/4 v3, 0x1

    aput-object v1, v8, v3

    const/4 v3, 0x2

    aput-object v1, v8, v3

    const/4 v3, 0x3

    aput-object v4, v8, v3

    const/4 v3, 0x4

    aput-object v5, v8, v3

    const/4 v3, 0x5

    aput-object v6, v8, v3

    const/4 v3, 0x6

    aput-object v7, v8, v3

    const/4 v3, 0x7

    aput-object v2, v8, v3

    aput-object v1, v8, v0

    sput-object v8, Lcom/whoop/archv2/model/template/FlowStep;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/archv2/model/template/FlowStep$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/FlowStep$$serializer;

    invoke-virtual {p11}, Lcom/whoop/archv2/model/template/FlowStep$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p11, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
            "Lcom/whoop/archv2/model/template/BackgroundModel;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/archv2/model/template/BackBehavior;",
            "Lcom/whoop/archv2/model/template/FlowStepTransition;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredKeys"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    .line 6
    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    .line 8
    iput-object p4, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    .line 10
    iput-object p6, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    .line 11
    iput-object p7, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    .line 12
    iput-object p8, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    .line 13
    iput-object p9, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_2

    .line 14
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_7

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p10, p9

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/archv2/model/template/FlowStep;-><init>(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->Companion:Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/BackBehavior;->Companion:Lcom/whoop/archv2/model/template/BackBehavior$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/BackBehavior$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/FlowStepTransition;->Companion:Lcom/whoop/archv2/model/template/FlowStepTransition$a;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/FlowStepTransition$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/FlowStep;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/archv2/model/template/FlowStep;Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/FlowStep;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/archv2/model/template/FlowStep;->copy(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowStep;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowStep;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$arch_v2_release(Lcom/whoop/archv2/model/template/FlowStep;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/archv2/model/template/FlowStep;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/archv2/model/template/BackgroundModel$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/BackgroundModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowStep;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcj0/b;->a(Lcom/whoop/archv2/model/template/FlowStep;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowStep;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    return-object v0
.end method

.method public final component2()Lcom/whoop/archv2/model/template/BackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/archv2/model/template/BackBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    return-object v0
.end method

.method public final component6()Lcom/whoop/archv2/model/template/FlowStepTransition;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowStep;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
            "Lcom/whoop/archv2/model/template/BackgroundModel;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/archv2/model/template/BackBehavior;",
            "Lcom/whoop/archv2/model/template/FlowStepTransition;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/archv2/model/template/FlowStep;"
        }
    .end annotation

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredKeys"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/archv2/model/template/FlowStep;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/archv2/model/template/FlowStep;-><init>(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/BackgroundModel;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/FlowStep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/model/template/FlowStep;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getAnalyticEvents()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    return-object v0
.end method

.method public final getBackBehavior()Lcom/whoop/archv2/model/template/BackBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    return-object v0
.end method

.method public final getBackground()Lcom/whoop/archv2/model/template/BackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getProgressButton()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getRequiredKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    return-object v0
.end method

.method public final getStepTransition()Lcom/whoop/archv2/model/template/FlowStepTransition;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    return-object v0
.end method

.method public final getTemplate()Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    invoke-virtual {v0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/archv2/model/template/BackgroundModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowStep;->template:Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowStep;->background:Lcom/whoop/archv2/model/template/BackgroundModel;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowStep;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowStep;->requiredKeys:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/archv2/model/template/FlowStep;->backBehavior:Lcom/whoop/archv2/model/template/BackBehavior;

    iget-object v5, p0, Lcom/whoop/archv2/model/template/FlowStep;->stepTransition:Lcom/whoop/archv2/model/template/FlowStepTransition;

    iget-object v6, p0, Lcom/whoop/archv2/model/template/FlowStep;->analyticEvents:Ljava/util/Map;

    iget-object v7, p0, Lcom/whoop/archv2/model/template/FlowStep;->bindings:Ljava/util/Map;

    iget-object v8, p0, Lcom/whoop/archv2/model/template/FlowStep;->aggregateBindings:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "FlowStep(template="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", background="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressButton="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requiredKeys="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backBehavior="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stepTransition="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvents="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    const-string v1, ", aggregateBindings="

    invoke-static {v9, v6, v0, v7, v1}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
