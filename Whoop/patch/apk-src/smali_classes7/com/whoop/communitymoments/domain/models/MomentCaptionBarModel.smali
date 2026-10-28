.class public final Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$$serializer;,
        Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0002QRB\u0096\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u0012+\u0008\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u008d\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u000cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0010\u0010%\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J3\u0010+\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u00a5\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c2+\u0008\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010 J\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010>\u001a\u0004\u0008?\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010@\u0012\u0004\u0008B\u0010C\u001a\u0004\u0008A\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010>\u001a\u0004\u0008D\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008E\u0010 R\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010>\u001a\u0004\u0008F\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010>\u001a\u0004\u0008G\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010H\u001a\u0004\u0008I\u0010(R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010J\u001a\u0004\u0008K\u0010*\"\u0004\u0008L\u0010MRE\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u00128\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010J\u001a\u0004\u0008N\u0010*\"\u0004\u0008O\u0010M\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "leading",
        "placeholder",
        "stateUpdateValueKey",
        "saveIcon",
        "saveContentDescription",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "submitInteraction",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;",
        "toString",
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
        "write$Self$community_moments_release",
        "(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getLeading",
        "getLeading$annotations",
        "()V",
        "getPlaceholder",
        "getStateUpdateValueKey",
        "getSaveIcon",
        "getSaveContentDescription",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getSubmitInteraction",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "community-moments_release"
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

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;


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

.field private final id:Ljava/lang/String;

.field private final leading:Lcom/whoop/design/models/DesignSystemModel;

.field private final placeholder:Ljava/lang/String;

.field private final saveContentDescription:Ljava/lang/String;

.field private final saveIcon:Ljava/lang/String;

.field private final stateUpdateValueKey:Ljava/lang/String;

.field private final submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->Companion:Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lur0/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lur0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lur0/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lur0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v3, v5, v7

    const/4 v3, 0x2

    aput-object v1, v5, v3

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x25

    const/16 v0, 0x25

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    :goto_0
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    .line 2
    const-string p2, "ARROW_FORWARD"

    .line 3
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    :goto_2
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    goto :goto_4

    :cond_5
    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    :goto_4
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_6

    iput-object p11, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p10, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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

    const-string v0, "saveIcon"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 12
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    .line 13
    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_2

    .line 14
    const-string p5, "ARROW_FORWARD"

    :cond_2
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_3

    move-object p7, v0

    :cond_3
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_4

    move-object p8, v0

    :cond_4
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_5

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

    :cond_5
    move-object p10, p9

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getLeading$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$community_moments_release(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    if-eqz v3, :cond_3

    :goto_1
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    const-string v4, "ARROW_FORWARD"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :goto_2
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
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

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lur0/c;->a(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "saveIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeading()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final getSaveContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getSaveIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmitInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

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

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->leading:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->placeholder:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->saveContentDescription:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->submitInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->bindings:Ljava/util/Map;

    iget-object v8, p0, Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;->aggregateBindings:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "MomentCaptionBarModel(id="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leading="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", placeholder="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stateUpdateValueKey="

    const-string v1, ", saveIcon="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", saveContentDescription="

    const-string v1, ", submitInteraction="

    invoke-static {v9, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
