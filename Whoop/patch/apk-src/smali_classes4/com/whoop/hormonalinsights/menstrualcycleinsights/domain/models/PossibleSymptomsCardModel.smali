.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 JB\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008/\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00081\u0010 \u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "",
        "Lcom/whoop/design/models/items/TagModel;",
        "symptomsTags",
        "rightIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getSymptomsTags",
        "getRightIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$Companion;


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final rightIcon:Ljava/lang/String;

.field private final symptomsTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lqo1/b;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lqo1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lqo1/b;

    invoke-direct {v4, v0}, Lqo1/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptomsTags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptomsTags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getSymptomsTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->symptomsTags:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;->destination:Lcom/whoop/navigation/e;

    const-string v4, ", symptomsTags="

    const-string v5, ", rightIcon="

    const-string v6, "PossibleSymptomsCardModel(title="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", destination="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
