.class public final Lcom/whoop/design/models/items/WheelContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/WheelContent$$serializer;,
        Lcom/whoop/design/models/items/WheelContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bg\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0016\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jf\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\'J\u0010\u0010-\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00087\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00088\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/design/models/items/WheelContent;",
        "",
        "Lcom/whoop/design/models/items/WheelContentType;",
        "type",
        "",
        "lowerBound",
        "upperBound",
        "stepSize",
        "",
        "padTo",
        "",
        "prefix",
        "",
        "Lcom/whoop/design/models/items/WheelOption;",
        "options",
        "<init>",
        "(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/WheelContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/WheelContentType;",
        "component2",
        "()Ljava/lang/Double;",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/WheelContent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/WheelContentType;",
        "getType",
        "Ljava/lang/Double;",
        "getLowerBound",
        "getUpperBound",
        "getStepSize",
        "Ljava/lang/Integer;",
        "getPadTo",
        "Ljava/lang/String;",
        "getPrefix",
        "Ljava/util/List;",
        "getOptions",
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

.field public static final Companion:Lcom/whoop/design/models/items/WheelContent$Companion;


# instance fields
.field private final lowerBound:Ljava/lang/Double;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/WheelOption;",
            ">;"
        }
    .end annotation
.end field

.field private final padTo:Ljava/lang/Integer;

.field private final prefix:Ljava/lang/String;

.field private final stepSize:Ljava/lang/Double;

.field private final type:Lcom/whoop/design/models/items/WheelContentType;

.field private final upperBound:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/WheelContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/WheelContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/WheelContent;->Companion:Lcom/whoop/design/models/items/WheelContent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/WheelContent;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/l;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lw91/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lw91/l;

    const/4 v5, 0x7

    invoke-direct {v4, v5}, Lw91/l;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v4, v5, [Ll83/h;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    const/4 v2, 0x2

    aput-object v1, v4, v2

    const/4 v2, 0x3

    aput-object v1, v4, v2

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v2, 0x5

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lcom/whoop/design/models/items/WheelContent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/WheelContent$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WheelContent$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/WheelContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    iput-object p3, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    iput-object p4, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    iput-object p5, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    iput-object p6, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    iput-object p7, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    return-void

    :cond_1
    iput-object p8, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/WheelContentType;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/WheelOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 12
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/WheelContent;-><init>(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.WheelContentType"

    invoke-static {}, Lcom/whoop/design/models/items/WheelContentType;->values()[Lcom/whoop/design/models/items/WheelContentType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/WheelOption$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WheelOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/WheelContent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/WheelContent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/WheelContent;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/WheelContent;Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/items/WheelContent;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/WheelContent;->copy(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/WheelContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/WheelContent;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/WheelContent;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/WheelContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/WheelOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/WheelContent;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/WheelContentType;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/WheelOption;",
            ">;)",
            "Lcom/whoop/design/models/items/WheelContent;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/WheelContent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/WheelContent;-><init>(Lcom/whoop/design/models/items/WheelContentType;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/WheelContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/WheelContent;

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getLowerBound()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/WheelOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getPadTo()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public final getStepSize()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final getType()Lcom/whoop/design/models/items/WheelContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    return-object v0
.end method

.method public final getUpperBound()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

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

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/WheelContent;->type:Lcom/whoop/design/models/items/WheelContentType;

    iget-object v1, p0, Lcom/whoop/design/models/items/WheelContent;->lowerBound:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/design/models/items/WheelContent;->upperBound:Ljava/lang/Double;

    iget-object v3, p0, Lcom/whoop/design/models/items/WheelContent;->stepSize:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/design/models/items/WheelContent;->padTo:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/design/models/items/WheelContent;->prefix:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/WheelContent;->options:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "WheelContent(type="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lowerBound="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stepSize="

    const-string v1, ", padTo="

    invoke-static {v7, v2, v0, v3, v1}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v0, ", prefix="

    const-string v1, ", options="

    invoke-static {v4, v0, v5, v1, v7}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
