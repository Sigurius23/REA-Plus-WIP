.class public final Lcom/whoop/design/models/items/MembershipComparisonTableModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/MembershipComparisonTableModel$$serializer;,
        Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B?\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBY\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JR\u0010%\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00080\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MembershipComparisonTableModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "",
        "features",
        "Lcom/whoop/design/models/items/MembershipPlan;",
        "plans",
        "priceLabel",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "secondaryButton",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/MembershipComparisonTableModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "component5",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/MembershipComparisonTableModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getFeatures",
        "getPlans",
        "Ljava/lang/String;",
        "getPriceLabel",
        "Lcom/whoop/design/models/items/SecondaryButtonModel;",
        "getSecondaryButton",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getButton",
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

.field public static final Companion:Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;


# instance fields
.field private final button:Lcom/whoop/design/models/items/CardButtonModel;

.field private final features:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final plans:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MembershipPlan;",
            ">;"
        }
    .end annotation
.end field

.field private final priceLabel:Ljava/lang/String;

.field private final secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->Companion:Lcom/whoop/design/models/items/MembershipComparisonTableModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/g;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lw91/g;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lw91/g;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lw91/g;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/MembershipComparisonTableModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MembershipComparisonTableModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/MembershipComparisonTableModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MembershipPlan;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "features"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plans"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/MembershipPlan$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MembershipPlan$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/MembershipComparisonTableModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/MembershipComparisonTableModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/MembershipComparisonTableModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SecondaryButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MembershipPlan;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/MembershipComparisonTableModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MembershipPlan;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SecondaryButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")",
            "Lcom/whoop/design/models/items/MembershipComparisonTableModel;"
        }
    .end annotation

    const-string v0, "features"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plans"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/CardButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    return-object v0
.end method

.method public final getPlans()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MembershipPlan;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    return-object v0
.end method

.method public final getPriceLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->features:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->plans:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->priceLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->secondaryButton:Lcom/whoop/design/models/items/SecondaryButtonModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    const-string v5, ", plans="

    const-string v6, ", priceLabel="

    const-string v7, "MembershipComparisonTableModel(features="

    invoke-static {v7, v5, v0, v6, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
