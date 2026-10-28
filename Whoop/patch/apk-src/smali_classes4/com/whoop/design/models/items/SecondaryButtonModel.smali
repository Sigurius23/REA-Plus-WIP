.class public final Lcom/whoop/design/models/items/SecondaryButtonModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;,
        Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002feB\u00b2\u0001\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0008\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012+\u0008\u0002\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\t0\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB\u00a1\u0001\u0008\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001c\u0010\"J#\u0010%\u001a\u00020\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u0014H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010(J\u0012\u00106\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J3\u0010:\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\t0\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00109J\u00bb\u0001\u0010;\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0016\u0008\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142+\u0008\u0002\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\t0\u001aH\u00c6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010(J\u0010\u0010>\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u001a\u0010A\u001a\u00020\u00122\u0008\u0010@\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001\u00a2\u0006\u0004\u0008I\u0010JR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010L\u001a\u0004\u0008M\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008O\u0010*R \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010P\u0012\u0004\u0008R\u0010S\u001a\u0004\u0008Q\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010T\u0012\u0004\u0008V\u0010S\u001a\u0004\u0008U\u0010.R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010W\u001a\u0004\u0008X\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Y\u001a\u0004\u0008Z\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010[\u001a\u0004\u0008\\\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010L\u001a\u0004\u0008]\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010^\u001a\u0004\u0008\u0013\u00107R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010_\u001a\u0004\u0008`\u00109\"\u0004\u0008a\u0010bRE\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\t0\u001a8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010_\u001a\u0004\u0008c\u00109\"\u0004\u0008d\u0010b\u00a8\u0006g"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lcom/whoop/navigation/e;",
        "action",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "Lcom/whoop/navigation/DismissEventModel;",
        "dismissEvent",
        "Lny0/m0;",
        "style",
        "alignment",
        "",
        "isEnabled",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "()Lcom/whoop/navigation/e;",
        "component4",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "component5",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component6",
        "()Lcom/whoop/navigation/DismissEventModel;",
        "component7",
        "()Lny0/m0;",
        "component8",
        "component9",
        "()Ljava/lang/Boolean;",
        "component10",
        "()Ljava/util/Map;",
        "component11",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SecondaryButtonModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/SecondaryButtonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getIcon",
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "Lcom/whoop/navigation/e;",
        "getAction",
        "getAction$annotations",
        "()V",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getModal",
        "getModal$annotations",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Lcom/whoop/navigation/DismissEventModel;",
        "getDismissEvent",
        "Lny0/m0;",
        "getStyle",
        "getAlignment",
        "Ljava/lang/Boolean;",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;


# instance fields
.field private final action:Lcom/whoop/navigation/e;

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

.field private final alignment:Ljava/lang/String;

.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

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

.field private final dismissEvent:Lcom/whoop/navigation/DismissEventModel;

.field private final icon:Ljava/lang/String;

.field private final isEnabled:Ljava/lang/Boolean;

.field private final modal:Lcom/whoop/design/models/modal/AnyModal;

.field private final style:Lny0/m0;

.field private final text:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel;->Companion:Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/SecondaryButtonModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/i;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lw91/i;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/i;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lw91/i;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/i;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Lw91/i;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/i;

    const/16 v7, 0x18

    invoke-direct {v6, v7}, Lw91/i;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0xb

    new-array v6, v6, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v3, v6, v7

    const/4 v3, 0x3

    aput-object v4, v6, v3

    const/4 v3, 0x4

    aput-object v1, v6, v3

    const/4 v3, 0x5

    aput-object v1, v6, v3

    const/4 v3, 0x6

    aput-object v5, v6, v3

    const/4 v3, 0x7

    aput-object v1, v6, v3

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v2, v6, v0

    const/16 v0, 0xa

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/design/models/items/SecondaryButtonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/design/models/items/SecondaryButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 5
    new-instance v2, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 7
    sget-object p2, Lny0/m0;->DEFAULT:Lny0/m0;

    .line 8
    :goto_6
    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    goto :goto_7

    :cond_6
    move-object/from16 p2, p8

    goto :goto_6

    :goto_7
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    goto :goto_8

    :cond_7
    move-object/from16 p2, p9

    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    goto :goto_9

    :cond_8
    move-object/from16 p2, p10

    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    :goto_9
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    goto :goto_a

    :cond_9
    move-object/from16 p2, p11

    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    :goto_a
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_a
    move-object/from16 p1, p12

    iput-object p1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Lny0/m0;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
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

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    .line 12
    iput-object p3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    .line 13
    iput-object p4, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    .line 14
    iput-object p5, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 15
    iput-object p6, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    .line 16
    iput-object p7, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    .line 17
    iput-object p8, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    .line 18
    iput-object p9, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    .line 19
    iput-object p10, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    .line 20
    iput-object p11, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 21
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 22
    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v3

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object v1, v2

    goto :goto_0

    :cond_3
    move-object v1, p4

    :goto_0
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_4

    move-object v3, v2

    goto :goto_1

    :cond_4
    move-object v3, p5

    :goto_1
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_5

    move-object v4, v2

    goto :goto_2

    :cond_5
    move-object v4, p6

    :goto_2
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    .line 23
    sget-object v5, Lny0/m0;->DEFAULT:Lny0/m0;

    goto :goto_3

    :cond_6
    move-object/from16 v5, p7

    :goto_3
    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_7

    move-object v6, v2

    goto :goto_4

    :cond_7
    move-object/from16 v6, p8

    :goto_4
    and-int/lit16 v7, v0, 0x100

    if-eqz v7, :cond_8

    move-object v7, v2

    goto :goto_5

    :cond_8
    move-object/from16 v7, p9

    :goto_5
    and-int/lit16 v8, v0, 0x200

    if-eqz v8, :cond_9

    move-object v8, v2

    goto :goto_6

    :cond_9
    move-object/from16 v8, p10

    :goto_6
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    move-object/from16 p12, v2

    :goto_7
    move-object p4, p3

    move-object p5, v1

    move-object p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_8

    :cond_a
    move-object/from16 p12, p11

    goto :goto_7

    .line 24
    :goto_8
    invoke-direct/range {p1 .. p12}, Lcom/whoop/design/models/items/SecondaryButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/design/models/modal/AnyModal;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v2

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.button.SecondaryButtonStyle"

    invoke-static {}, Lny0/m0;->values()[Lny0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

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

    invoke-static {}, Lcom/whoop/design/models/items/SecondaryButtonModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SecondaryButtonModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SecondaryButtonModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    :cond_a
    move-object p12, p10

    move-object p13, p11

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

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/SecondaryButtonModel;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SecondaryButtonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAction$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getModal$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/SecondaryButtonModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/navigation/DismissEventModel$$serializer;->INSTANCE:Lcom/whoop/navigation/DismissEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    sget-object v3, Lny0/m0;->DEFAULT:Lny0/m0;

    if-eq v2, v3, :cond_d

    :goto_6
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_13

    :goto_9
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
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

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/SecondaryButtonModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component5()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final component7()Lny0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Lny0/m0;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/SecondaryButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAction()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getAlignment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    return-object v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDismissEvent()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getStyle()Lny0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    return-object v0
.end method

.method public final getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    invoke-static {v3, v0, v2}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/navigation/DismissEventModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v3, v1

    return v3
.end method

.method public final isEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    return-object v0
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

    iput-object p1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->text:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->action:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v4, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->style:Lny0/m0;

    iget-object v7, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->alignment:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->isEnabled:Ljava/lang/Boolean;

    iget-object v9, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->bindings:Ljava/util/Map;

    iget-object v10, p0, Lcom/whoop/design/models/items/SecondaryButtonModel;->aggregateBindings:Ljava/util/Map;

    const-string v11, ", text="

    const-string v12, ", action="

    const-string v13, "SecondaryButtonModel(icon="

    invoke-static {v13, v0, v11, v1, v12}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
