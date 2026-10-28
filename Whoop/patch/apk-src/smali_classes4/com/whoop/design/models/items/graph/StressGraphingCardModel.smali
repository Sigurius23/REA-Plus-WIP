.class public final Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;,
        Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0010\u0010!\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0090\u0001\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010<\u001a\u0004\u0008=\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010>\u001a\u0004\u0008?\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010>\u001a\u0004\u0008@\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010>\u001a\u0004\u0008A\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010>\u001a\u0004\u0008B\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010>\u001a\u0004\u0008C\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010D\u001a\u0004\u0008E\u0010\"R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008F\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008G\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010H\u001a\u0004\u0008I\u0010&R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010J\u001a\u0004\u0008K\u0010(\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "",
        "title",
        "icon",
        "cta",
        "lastUpdatedText",
        "stressGraphVowDisplay",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "stressGraphState",
        "stressGraphLabel",
        "stressGraphScore",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;",
        "size",
        "",
        "subItems",
        "<init>",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/graph/stress/StressState;",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/items/graph/StressGraphingCardSize;",
        "component11",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Ljava/lang/String;",
        "getTitle",
        "getIcon",
        "getCta",
        "getLastUpdatedText",
        "getStressGraphVowDisplay",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "getStressGraphState",
        "getStressGraphLabel",
        "getStressGraphScore",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;",
        "getSize",
        "Ljava/util/List;",
        "getSubItems",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;


# instance fields
.field private final cta:Ljava/lang/String;

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final icon:Ljava/lang/String;

.field private final lastUpdatedText:Ljava/lang/String;

.field private final size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

.field private final stressGraphLabel:Ljava/lang/String;

.field private final stressGraphScore:Ljava/lang/String;

.field private final stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

.field private final stressGraphVowDisplay:Ljava/lang/String;

.field private final subItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->Companion:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lep0/a;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lep0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lga1/b;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lga1/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lga1/b;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lga1/b;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0xb

    new-array v6, v6, [Ll83/h;

    aput-object v1, v6, v5

    aput-object v1, v6, v7

    const/4 v5, 0x2

    aput-object v1, v6, v5

    const/4 v5, 0x3

    aput-object v1, v6, v5

    const/4 v5, 0x4

    aput-object v1, v6, v5

    const/4 v5, 0x5

    aput-object v1, v6, v5

    const/4 v5, 0x6

    aput-object v3, v6, v5

    const/4 v3, 0x7

    aput-object v1, v6, v3

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v4, v6, v0

    const/16 v0, 0xa

    aput-object v2, v6, v0

    sput-object v6, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iput-object p9, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    iput-object p12, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/stress/StressState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphLabel"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphScore"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.stress.StressState"

    invoke-static {}, Lcom/whoop/design/models/items/graph/stress/StressState;->values()[Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.StressGraphingCardSize"

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardSize;->values()[Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

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

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/graph/StressGraphingCardSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/stress/StressState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;"
        }
    .end annotation

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphState"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphLabel"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressGraphScore"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;-><init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastUpdatedText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()Lcom/whoop/design/models/items/graph/StressGraphingCardSize;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    return-object v0
.end method

.method public final getStressGraphLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStressGraphScore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    return-object v0
.end method

.method public final getStressGraphState()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final getStressGraphVowDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->icon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->cta:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->lastUpdatedText:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphVowDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object v7, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphLabel:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->stressGraphScore:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->size:Lcom/whoop/design/models/items/graph/StressGraphingCardSize;

    iget-object v10, p0, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->subItems:Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "StressGraphingCardModel(graph="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    const-string v1, ", lastUpdatedText="

    invoke-static {v11, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", stressGraphVowDisplay="

    const-string v1, ", stressGraphState="

    invoke-static {v11, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stressGraphLabel="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stressGraphScore="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subItems="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
