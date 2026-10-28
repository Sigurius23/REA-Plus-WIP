.class public final Lcom/whoop/design/models/items/ToggleDesignModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ToggleDesignModel$$serializer;,
        Lcom/whoop/design/models/items/ToggleDesignModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0096\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012+\u0008\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011\u00a2\u0006\u000c\u0008\u0012\u0012\u0008\u0008\u0013\u0012\u0004\u0008\t0\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u000eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011\u00a2\u0006\u000c\u0008\u0012\u0012\u0008\u0008\u0013\u0012\u0004\u0008\t0\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u00a3\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2+\u0008\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011\u00a2\u0006\u000c\u0008\u0012\u0012\u0008\u0008\u0013\u0012\u0004\u0008\t0\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\"J\u0010\u00102\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00105\u001a\u00020\u00052\u0008\u00104\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008A\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010B\u001a\u0004\u0008\u0006\u0010$R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010B\u0012\u0004\u0008C\u0010D\u001a\u0004\u0008\u0007\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010E\u001a\u0004\u0008F\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010E\u001a\u0004\u0008G\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008H\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010+R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008L\u0010-\"\u0004\u0008M\u0010NRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011\u00a2\u0006\u000c\u0008\u0012\u0012\u0008\u0008\u0013\u0012\u0004\u0008\t0\u00148\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010K\u001a\u0004\u0008O\u0010-\"\u0004\u0008P\u0010N\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ToggleDesignModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "label",
        "",
        "isEnabled",
        "isReadOnly",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "toggleOnInteraction",
        "toggleOffInteraction",
        "style",
        "Ly81/f;",
        "toggledOnColor",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component5",
        "component6",
        "component7",
        "()Ly81/f;",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "copy",
        "(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ToggleDesignModel;",
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
        "(Lcom/whoop/design/models/items/ToggleDesignModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getLabel",
        "Z",
        "isReadOnly$annotations",
        "()V",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getToggleOnInteraction",
        "getToggleOffInteraction",
        "getStyle",
        "Ly81/f;",
        "getToggledOnColor",
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

.field public static final Companion:Lcom/whoop/design/models/items/ToggleDesignModel$Companion;


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

.field private final isEnabled:Z

.field private final isReadOnly:Z

.field private final label:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggledOnColor:Ly81/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/ToggleDesignModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ToggleDesignModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ToggleDesignModel;->Companion:Lcom/whoop/design/models/items/ToggleDesignModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ToggleDesignModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/k;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/k;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lw91/k;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x9

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v3, v4, v5

    const/4 v3, 0x7

    aput-object v2, v4, v3

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/ToggleDesignModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/ToggleDesignModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ToggleDesignModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/ToggleDesignModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    goto :goto_0

    :cond_1
    iput-boolean p4, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    :goto_0
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    :goto_5
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p10, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/lang/String;",
            "Ly81/f;",
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

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    .line 5
    iput-boolean p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, v0, 0x8

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    move-object v4, v1

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, v0, 0x10

    if-eqz p3, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p3, v0, 0x20

    if-eqz p3, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p3, v0, 0x40

    if-eqz p3, :cond_4

    move-object v7, v1

    goto :goto_3

    :cond_4
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_5

    move-object v8, v1

    goto :goto_4

    :cond_5
    move-object/from16 v8, p8

    :goto_4
    and-int/lit16 p3, v0, 0x100

    if-eqz p3, :cond_6

    move-object v9, v1

    move-object v0, p0

    move v2, p2

    move-object v1, p1

    goto :goto_5

    :cond_6
    move-object/from16 v9, p9

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 12
    :goto_5
    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/ToggleDesignModel;-><init>(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

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

    invoke-static {}, Lcom/whoop/design/models/items/ToggleDesignModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ToggleDesignModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ToggleDesignModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ToggleDesignModel;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/ToggleDesignModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-boolean p2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/ToggleDesignModel;->copy(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ToggleDesignModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isReadOnly$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_disabled"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ToggleDesignModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/ToggleDesignModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    if-eqz v2, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
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

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleDesignModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/ToggleDesignModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/ToggleDesignModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ToggleDesignModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    return v0
.end method

.method public final component4()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ToggleDesignModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/lang/String;",
            "Ly81/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/ToggleDesignModel;"
        }
    .end annotation

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ToggleDesignModel;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/ToggleDesignModel;-><init>(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ToggleDesignModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ToggleDesignModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggledOnColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    return v0
.end method

.method public final isReadOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->label:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isEnabled:Z

    iget-boolean v2, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->isReadOnly:Z

    iget-object v3, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v4, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->style:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->toggledOnColor:Ly81/f;

    iget-object v7, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->bindings:Ljava/util/Map;

    iget-object v8, p0, Lcom/whoop/design/models/items/ToggleDesignModel;->aggregateBindings:Ljava/util/Map;

    const-string v9, ", isEnabled="

    const-string v10, ", isReadOnly="

    const-string v11, "ToggleDesignModel(label="

    invoke-static {v11, v0, v9, v10, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", toggleOnInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggleOffInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", toggledOnColor="

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
