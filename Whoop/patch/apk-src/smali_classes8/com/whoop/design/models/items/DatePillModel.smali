.class public final Lcom/whoop/design/models/items/DatePillModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DatePillModel$$serializer;,
        Lcom/whoop/design/models/items/DatePillModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002WVB\u0090\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u008b\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J3\u00102\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00101J\u00a1\u0001\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010$J\u0010\u00106\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u00109\u001a\u00020\u00082\u0008\u00108\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:J\'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001\u00a2\u0006\u0004\u0008A\u0010BR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010D\u001a\u0004\u0008E\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008F\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010G\u001a\u0004\u0008H\u0010\'R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010I\u001a\u0004\u0008\t\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010J\u001a\u0004\u0008K\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010L\u001a\u0004\u0008M\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010N\u001a\u0004\u0008O\u0010/R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010P\u001a\u0004\u0008Q\u00101\"\u0004\u0008R\u0010SRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010P\u001a\u0004\u0008T\u00101\"\u0004\u0008U\u0010S\u00a8\u0006X"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DatePillModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "date",
        "Lcom/whoop/design/models/DateDisplay;",
        "display",
        "",
        "isSelected",
        "Lcom/whoop/design/models/items/DatePillStatus;",
        "status",
        "Ly81/f;",
        "selectedColor",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/DateDisplay;",
        "component4",
        "()Z",
        "component5",
        "()Lcom/whoop/design/models/items/DatePillStatus;",
        "component6",
        "()Ly81/f;",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/DatePillModel;",
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
        "(Lcom/whoop/design/models/items/DatePillModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getDate",
        "Lcom/whoop/design/models/DateDisplay;",
        "getDisplay",
        "Z",
        "Lcom/whoop/design/models/items/DatePillStatus;",
        "getStatus",
        "Ly81/f;",
        "getSelectedColor",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
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

.field public static final Companion:Lcom/whoop/design/models/items/DatePillModel$Companion;


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

.field private final date:Ljava/lang/String;

.field private final display:Lcom/whoop/design/models/DateDisplay;

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final isSelected:Z

.field private final selectedColor:Ly81/f;

.field private final status:Lcom/whoop/design/models/items/DatePillStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/DatePillModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DatePillModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DatePillModel;->Companion:Lcom/whoop/design/models/items/DatePillModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/DatePillModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/c;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lw91/c;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/c;

    invoke-direct {v5, v0}, Lw91/c;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/c;

    const/16 v7, 0x9

    invoke-direct {v6, v7}, Lw91/c;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v6, v7, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v7, 0x3

    aput-object v1, v6, v7

    const/4 v7, 0x4

    aput-object v3, v6, v7

    const/4 v3, 0x5

    aput-object v5, v6, v3

    const/4 v3, 0x6

    aput-object v1, v6, v3

    aput-object v2, v6, v4

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/design/models/items/DatePillModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1d

    const/16 v0, 0x1d

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/DatePillModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DatePillModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/DatePillModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    :goto_0
    iput-object p4, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    iput-boolean p5, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    iput-object p6, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p11, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    :goto_3
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_5

    iput-object p11, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_5
    iput-object p10, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Z",
            "Lcom/whoop/design/models/items/DatePillStatus;",
            "Ly81/f;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
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

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "display"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_3

    move-object p8, v0

    :cond_3
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_4

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/design/models/items/DatePillModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.DatePillStatus"

    invoke-static {}, Lcom/whoop/design/models/items/DatePillStatus;->values()[Lcom/whoop/design/models/items/DatePillStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

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

    invoke-static {}, Lcom/whoop/design/models/items/DatePillModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DatePillModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DatePillModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DatePillModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DatePillModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/DatePillModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/DatePillModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/DatePillModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DatePillModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/DatePillModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/design/models/DateDisplay$$serializer;->INSTANCE:Lcom/whoop/design/models/DateDisplay$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
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

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DatePillModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/DatePillModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/DatePillModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/DatePillModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    return v0
.end method

.method public final component5()Lcom/whoop/design/models/items/DatePillStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    return-object v0
.end method

.method public final component6()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/DatePillModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Z",
            "Lcom/whoop/design/models/items/DatePillStatus;",
            "Ly81/f;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/DatePillModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "display"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DatePillModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/DatePillModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;ZLcom/whoop/design/models/items/DatePillStatus;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DatePillModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DatePillModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplay()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getSelectedColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    return-object v0
.end method

.method public final getStatus()Lcom/whoop/design/models/items/DatePillStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    invoke-virtual {v2}, Lcom/whoop/design/models/DateDisplay;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    return v2
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/DatePillModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/DatePillModel;->date:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/DatePillModel;->display:Lcom/whoop/design/models/DateDisplay;

    iget-boolean v3, p0, Lcom/whoop/design/models/items/DatePillModel;->isSelected:Z

    iget-object v4, p0, Lcom/whoop/design/models/items/DatePillModel;->status:Lcom/whoop/design/models/items/DatePillStatus;

    iget-object v5, p0, Lcom/whoop/design/models/items/DatePillModel;->selectedColor:Ly81/f;

    iget-object v6, p0, Lcom/whoop/design/models/items/DatePillModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lcom/whoop/design/models/items/DatePillModel;->bindings:Ljava/util/Map;

    iget-object v8, p0, Lcom/whoop/design/models/items/DatePillModel;->aggregateBindings:Ljava/util/Map;

    const-string v9, ", date="

    const-string v10, ", display="

    const-string v11, "DatePillModel(id="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
